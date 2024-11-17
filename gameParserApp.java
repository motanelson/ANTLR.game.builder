//javac -cp .:antlr-4.9.2-complete.jar *.java
//java -cp .:antlr-4.9.2-complete.jar gameParserApp

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class gameParserApp {

        public static void main(String[] args) {
        boolean errors =false;
        String s="";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("OBJECTS can be create 'CASTLE x,y' 'HOUSE x,y' 'MAN x,y' emply promp exit\n");
        
        while (true) {
            System.out.print("\n> ");
            String input = scanner.nextLine();
            
            if (input.trim().isEmpty()) {
                System.out.println("end game.");
                break;
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
                
                for (Token token : tokens.getTokens()) {
                    s=token.getText().toString();
                    if (s.indexOf("line")>-1){
                        System.out.printf("error\n");
                        errors=true;
                        
                    }else{
                        if(!errors){
                            if (s.indexOf("CASTLE")>-1){
                                System.out.printf("CREATING A CASTLE ");
                            }else{
                                if (s.indexOf("HOUSE")>-1){
                                    System.out.printf("CREATING A HOUSE ");
                                }else{ 
                                    if (s.indexOf("MAN")>-1){
                                         System.out.printf("CREATING A MAN ");
                                    }else{
                                       if (s.indexOf("<EOF>")>-1){
                                            System.out.printf("\n");
                                       }else{
                                             System.out.printf(" %s ",s);
                                             
                                       }
                                  }    
                           }   }      
                       }
                    }
                }

            } catch (Exception e) {
                System.out.println("Erro ao analisar a linha: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}

