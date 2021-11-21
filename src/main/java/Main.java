import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            if (args.length > 1) {
                throw new Error("Deve haver apenas 1 argumento!");
            }
            String argumento = args[0];
            if (!argumento.split("\\.")[1].equals("lcc")) {
                throw new Error("Tipo de arquivo incorreto!");
            }
            String nomeArquivo = argumento.split("\\.")[0];
            String path = "./teste/" + argumento;
            CharStream charStream = CharStreams.fromFileName(path);
            CC20212Lexer cc20212Lexer = new CC20212Lexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(cc20212Lexer);
            CC20212Parser cc20212Parser = new CC20212Parser(commonTokenStream);

            cc20212Parser.program();

            // verificando a existência de erros no analisador léxico:
            int erros = cc20212Parser.getNumberOfSyntaxErrors();
            if (erros > 0)
                System.out.println("Existem erros léxicos! O mesmo pode ser verificado acima");

            // criando um set com os lexemas a partir dos tokens gerados pelo
            // CommonTokenStream
            HashSet<String> lexemas = new HashSet<String>();
            int tipo;
            String symbolicName;
            for (Token token : commonTokenStream.getTokens()) {
                tipo = token.getType();
                symbolicName = CC20212Lexer.VOCABULARY.getSymbolicName(tipo);
                if (symbolicName.equals("IDENT")) {
                    lexemas.add(token.getText());
                }
            }

            // Criando a tabela de Tokens:
            ArrayList<String> tokenList = new ArrayList<>();
            for (Token token : commonTokenStream.getTokens()) {
                tipo = token.getType();
                symbolicName = CC20212Lexer.VOCABULARY.getSymbolicName(tipo);
                String lexema = token.getText();
                int linha = token.getLine();
                int indiceInicio = token.getStartIndex();
                int indiceFinal = token.getStopIndex();
                int indiceToken = token.getTokenIndex();

                String itemLista = "";

                itemLista = indiceToken + 1 + "º Token -> Lexema: \t" + lexema + "\t Tipo: " + symbolicName
                        + "\t Linha: " + linha + "\t Indice Inicial: " + indiceInicio + "\t Indice Final: "
                        + indiceFinal + "\n";
                tokenList.add(itemLista);
            }
            System.out.println(tokenList);
            // Salvando a tabela de tonkens em arquivo de saída:
            File dirAtual = new File(".");
            File dirSaidaToken = new File(dirAtual.getCanonicalPath() + "/saida_lexico/tabela_tokens");
            // verifica se ja não existe a pasta:
            if (!dirSaidaToken.exists()) {
                dirSaidaToken.mkdirs();
            }
            File dirArquivo = new File(dirSaidaToken + "/" + nomeArquivo);
            FileWriter fileWriter = new FileWriter(dirArquivo);
            fileWriter.write(
                    "--------------------------------------- Tabela de Tokens ---------------------------------------\n");
            for (String linha : tokenList) {
                fileWriter.write(linha);
            }
            fileWriter.close();

        } catch (Error e) {
            System.out.println(e.getMessage());
        }

    }
}
