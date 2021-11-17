import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = args[0];
        CharStream charStream = CharStreams.fromFileName(path);
        CC20212Lexer cc20212Lexer = new CC20212Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cc20212Lexer);
        CC20212Parser cc20212Parser = new CC20212Parser(commonTokenStream);

        cc20212Parser.program();

        int erros = cc20212Parser.getNumberOfSyntaxErrors();
        System.out.println(erros);
    }
}