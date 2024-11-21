import tkinter as tk
from tkinter import filedialog, messagebox
import subprocess
import csv


class ShellApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Shell Command Executor")

        # Botão para carregar o arquivo .shell
        self.load_button = tk.Button(root, text="Load .shell File", command=self.load_shell_file)
        self.load_button.pack(pady=10)

        # Frame para os botões criados
        self.buttons_frame = tk.Frame(root)
        self.buttons_frame.pack(fill=tk.BOTH, expand=True)

    def load_shell_file(self):
        shell_path = filedialog.askopenfilename(filetypes=[("Shell Files", "*.shell")])
        if not shell_path:
            return

        try:
            with open(shell_path, "r") as file:
                reader = csv.reader(file)
                commands = list(reader)

            # Limpa os botões anteriores
            for widget in self.buttons_frame.winfo_children():
                widget.destroy()

            # Adiciona os botões dinamicamente
            for name, command in commands:
                btn = tk.Button(
                    self.buttons_frame,
                    text=name,
                    command=lambda cmd=command: self.execute_command(cmd)
                )
                btn.pack(pady=5, padx=10, fill=tk.X)

        except Exception as e:
            messagebox.showerror("Error", f"Failed to load .shell file: {e}")

    def execute_command(self, command):
        try:
            subprocess.run(command, shell=True)
        except Exception as e:
            messagebox.showerror("Error", f"Failed to execute command: {e}")


if __name__ == "__main__":
    root = tk.Tk()
    app = ShellApp(root)
    root.mainloop()

