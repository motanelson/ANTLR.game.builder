//javac -cp .:antlr-4.9.2-complete.jar *.java
//java -cp .:antlr-4.9.2-complete.jar testParserApp

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class gameParserApp extends JFrame {
    String source="CASTLE 50,50\r\nHOUSE 50,200\r\n";
    public gameParserApp() {
        // Configurações da janela
        setTitle("Janela com Canvas");
        setSize(600, 400); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setResizable(false);

        // Configuração do Canvas personalizado
        DrawingCanvas canvas = new DrawingCanvas();
        add(canvas);

        // Cor de fundo da janela
        getContentPane().setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            gameParserApp app = new gameParserApp();
            app.setVisible(true);
        });
    }

    // Classe interna para o Canvas personalizado
    class DrawingCanvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        
        boolean errors =false;
        String s="";
            int rectWidth = 50;
            int rectHeight = 50;


            // Cor de fundo do canvas (opcional)
            setBackground(Color.BLACK);

            // Configurações para desenhar o retângulo branco
        g.setColor(Color.WHITE);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("OBJECTS can be create 'CASTLE x,y' 'HOUSE x,y' 'MAN x,y' emply promp exit\n");
        
        
            System.out.print("\n> ");
            String input = source;
            
            if (input.trim().isEmpty()) {
                System.out.println("end game.");
                errors=true;
            }

            try {
                // Cria um CharStream a partir da entrada do usuário
                
                CharStream charStream = CharStreams.fromString(input);

                // Inicializa o lexer e o parser com o CharStream
                gameLexer lexer = new gameLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                gameParser parser = new gameParser(tokens);
                
                CustomErrorListener errorListener = new CustomErrorListener();
                lexer.removeErrorListeners(); // Remove o ErrorListener padrão
                lexer.addErrorListener(errorListener); // Adiciona o listener personalizado
                parser.removeErrorListeners(); // Remove o ErrorListener padrão
                parser.addErrorListener(errorListener); // Adiciona o listener personalizado

            // Inicia o parsing (ajuste a regra inicial conforme sua gramática)
                // Inicia o parser a partir da regra de entrada do arquivo gameParser
                ParseTree tree = parser.program();  // Altere "program" para a regra de entrada correta
                errors =false;
                if (errorListener.hasErrors()) {
                    System.out.println("Erros encontrados:");
                    for (String error : errorListener.getErrors()) {
                    errors =true;

                }}
                
                
                
                // Exibe a árvore sintática
                System.out.println("----------------------------------- ");

                // Exibe os tokens da linha de entrada
                System.out.println("");
                tokens.fill();
                int i=0;
                int xxx=0;
                int yyy=0;
                int ii=0;
                for (Token token : tokens.getTokens()) {
                    
                    s=token.getText().toString();
                    if (s.indexOf("line")>-1){
                        System.out.printf("error\n");
                        errors=true;
                        
                    }else{
                        if(!errors){
                            if (s.indexOf("CASTLE")>-1){
                                System.out.printf("CREATING A CASTLE ");
                                i=1;
                            }else{
                                if (s.indexOf("HOUSE")>-1){
                                    System.out.printf("CREATING A HOUSE ");
                                    i=1;
                                }else{ 
                                    if (s.indexOf("MAN")>-1){
                                         System.out.printf("CREATING A MAN ");
                                         i=1;
                                    }else{
                                       if (s.indexOf("<EOF>")>-1){
                                            ii=0;
                                            
                                            System.out.println("\nend game.");
                                            ii=0;
                                            i=1;
                                       }else{
                                             if (ii==0 && s.indexOf(",")==-1){
                                                 xxx=Integer.parseInt(s.trim());
                                                 ii=ii+1;
                                                 System.out.printf(" %s ",s);

                                             }else{ if(ii==1 && s.indexOf(",")==-1){ 
                                                 yyy=Integer.parseInt(s.trim());
                                                 System.out.printf(" %s \n",s);
                                                 
                                                 // Desenha o retângulo branco
                                                 g.fillRect(xxx, yyy, rectWidth, rectHeight);

                                                 ii=0;
                                             }}
                                       }
                                  }    
                           }   }      
                       }
                    }
                }

            } catch (Exception e) {
                System.out.println("Erro ao analisar a linha: " + e.getMessage());
            }
        
        
        scanner.close();
        

            
           
            

                               }
    }
}
