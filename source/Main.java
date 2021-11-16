import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = args[0];

        CharStream charStream = CharStream.fromFileName(path);

    }
}