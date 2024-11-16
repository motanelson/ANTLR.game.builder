//javac -cp .:antlr-4.9.2-complete.jar *.java
//java -cp .:antlr-4.9.2-complete.jar gameParserApp

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;

public class gameParserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira uma linha para análise (ou pressione Enter para sair):");
        
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.trim().isEmpty()) {
                System.out.println("Encerrando o programa.");
                break;
            }

            try {
                // Cria um CharStream a partir da entrada do usuário
                CharStream charStream = CharStreams.fromString(input);

                // Inicializa o lexer e o parser com o CharStream
                gameLexer lexer = new gameLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                gameParser parser = new gameParser(tokens);

                // Inicia o parser a partir da regra de entrada do arquivo gameParser
                ParseTree tree = parser.program();  // Altere "program" para a regra de entrada correta

                // Exibe a árvore sintática
                System.out.println("Árvore Sintática: " + tree.toStringTree(parser));

                // Exibe os tokens da linha de entrada
                System.out.println("Tokens:");
                tokens.fill();
                for (Token token : tokens.getTokens()) {
                    System.out.printf("Tipo: %s, Valor: %s%n", gameLexer.VOCABULARY.getSymbolicName(token.getType()), token.getText());
                }

            } catch (Exception e) {
                System.out.println("Erro ao analisar a linha: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}

