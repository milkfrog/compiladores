import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = args[0];

        CharStream charStream = CharStreams.fromFileName(path);

    }
}