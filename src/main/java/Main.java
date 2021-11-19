import java.io.IOException;
import java.util.HashSet;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = args[0];
        CharStream charStream = CharStreams.fromFileName(path);
        CC20212Lexer cc20212Lexer = new CC20212Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cc20212Lexer);
        CC20212Parser cc20212Parser = new CC20212Parser(commonTokenStream);

        cc20212Parser.program();

        // verificando a existência de erros no analisador léxico:
        int erros = cc20212Parser.getNumberOfSyntaxErrors();
        if (erros > 0)
            System.out.println("Existem erros léxicos!");

        // criando um set com os lexemas a partir dos tokens gerados pelo
        // CommonTokenStream
        HashSet<String> lexemas = new HashSet<String>();
        for (Token token : commonTokenStream.getTokens()) {
            int type = token.getType();
            String symbolicName = CC20212Lexer.VOCABULARY.getSymbolicName(type);
            if (symbolicName.equals("IDENT")) {
                lexemas.add(token.getText());
            }
        }

    }
}
