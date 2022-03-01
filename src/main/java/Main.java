import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

public class Main {
    public static void main(String[] args) throws IOException {

        // Integrantes:
        // Marcelo Pietro Grutzmacher Contin (19150807)
        // Matheus Leonel Balduino (17202305)

        String CorVerdeBold = "\033[1;32m";
        String CorAzulBold = "\033[1;34m";
        String ResetCor = "\033[0m";

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

            System.out.println("\n\n\n\n" + CorAzulBold + "Iniciando a Análise Léxica" + ResetCor);

            CharStream charStream = CharStreams.fromFileName(path);
            ConvCC20212Lexer convCC20212Lexer = new ConvCC20212Lexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(convCC20212Lexer);
            ConvCC20212Parser convCC20212Parser = new ConvCC20212Parser(commonTokenStream);

            System.out.println(CorAzulBold + "Iniciando a Análise Sintática" + ResetCor);
            ParseTree parseTree = convCC20212Parser.program();

            // verificando a existência de erros Sintáticos no analisador léxico:
            int erros = convCC20212Parser.getNumberOfSyntaxErrors();
            if (erros > 0)
                throw new Error("Existem erros Sintáticos! O mesmo pode ser verificado acima");

            // criando um set com os lexemas a partir dos tokens gerados pelo
            // CommonTokenStream (tabela de Simbolos):
            HashSet<String> lexemas = new HashSet<String>();
            int tipo;
            String symbolicName;
            for (Token token : commonTokenStream.getTokens()) {
                tipo = token.getType();
                symbolicName = ConvCC20212Lexer.VOCABULARY.getSymbolicName(tipo);
                if (symbolicName.equals("IDENT")) {
                    lexemas.add(token.getText());
                }
            }

            // Criando a tabela de Tokens:
            ArrayList<String> tokenList = new ArrayList<>();
            for (Token token : commonTokenStream.getTokens()) {
                tipo = token.getType();
                symbolicName = ConvCC20212Lexer.VOCABULARY.getSymbolicName(tipo);
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
            // Salvando a tabela de tonkens em arquivo de saída:
            File dirAtualToken = new File(".");
            File dirSaidaToken = new File(dirAtualToken.getCanonicalPath() + "/saida/tabela_tokens");
            // verifica se ja não existe a pasta:
            if (!dirSaidaToken.exists()) {
                dirSaidaToken.mkdirs();
            }
            File dirArquivoToken = new File(dirSaidaToken + "/" + nomeArquivo + ".txt");
            FileWriter fileWriterToken = new FileWriter(dirArquivoToken);
            fileWriterToken.write(
                    "--------------------------------------- Tabela de Tokens ---------------------------------------\n");
            for (String linha : tokenList) {
                fileWriterToken.write(linha);
            }
            fileWriterToken.close();

            // Criando a tabela de Simbolos:
            File dirAtualSimbolo = new File(".");
            File dirSaidaSimbolo = new File(dirAtualSimbolo.getCanonicalPath() + "/saida/tabela_simbolos");
            // verifica se ja não existe a pasta:
            if (!dirSaidaSimbolo.exists()) {
                dirSaidaSimbolo.mkdirs();
            }
            File dirArquivoSimbolo = new File(dirSaidaSimbolo + "/" + nomeArquivo + ".txt");
            FileWriter fileWriterSimbolo = new FileWriter(dirArquivoSimbolo);
            fileWriterSimbolo.write(
                    "--------------------------------------- Tabela de Simbolos ---------------------------------------\n");
            int contador = 1;
            for (String linha : lexemas) {
                fileWriterSimbolo.write(contador + "º Simbolo -> Lexema: \t" + linha + "\n");
                contador++;
            }
            fileWriterSimbolo.close();

            TreeViewer treeViewer = new TreeViewer(Arrays.asList(convCC20212Parser.getRuleNames()), parseTree);
            treeViewer.open();

            if (erros == 0) {
                System.out.println(
                        CorVerdeBold + "Finalizado sem erros e árvore sintática gerada com sucesso!" + ResetCor);
                System.out.println(CorAzulBold + "Resumo:\n\n" + ResetCor);
                System.out.println(CorAzulBold + "Todas as operações Aritméticas são válidas." + ResetCor);
                System.out.println(CorAzulBold + "Todas as variáveis declaradas são válidas." + ResetCor);
                System.out.println(
                        CorAzulBold + "Todas as operações de break estão contidas em operações 'for'." + ResetCor);

                System.out.println("\n\n\n\n" + CorVerdeBold
                        + "Finalizado com SUCESSO!\nOs arquivos foram geradas na pasta saida!" + ResetCor);
            }

        } catch (Error e) {
            System.out.println(e.getMessage());
        }

    }
}
