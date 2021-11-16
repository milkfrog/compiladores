import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = args[0];

        CharStream charStream = CharStreams.fromFileName(path);

        CC20212Lexer teste = new CC20212Lexer(charStream);

    }
}