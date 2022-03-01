import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Scope.ScopeNode;
import ExpressionTree.ExpressionTree;

public class Utils {

    static public void exportExpressionTrees(List<ExpressionTree> trees) {
        String newFileName = "ExpTrees.txt";
        try {
            File dirAtualToken = new File(".");
            File dirSaidaToken = new File(dirAtualToken.getCanonicalPath() + "/saida/ExpressionTrees");
            if (!dirSaidaToken.exists()) {
                dirSaidaToken.mkdirs();
            }
            File newFile = new File(dirSaidaToken + "/" + newFileName);
            FileWriter writer = new FileWriter(newFile);
            for (ExpressionTree t : trees) {
                String s = t.getRoot().toString();
                writer.write(s + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public void exportIntermediaryCode(String code) {
        String newFileName = "CI.txt";
        try {
            File dirAtualToken = new File(".");
            File dirSaidaToken = new File(dirAtualToken.getCanonicalPath() + "/saida/CI");
            if (!dirSaidaToken.exists()) {
                dirSaidaToken.mkdirs();
            }
            File newFile = new File(dirSaidaToken + "/" + newFileName);
            FileWriter writer = new FileWriter(newFile);
            writer.write(code);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public void exportScopes(List<ScopeNode> scopes) {
        String newFileName = "Scopes.txt";
        try {
            File dirAtualToken = new File(".");
            File dirSaidaToken = new File(dirAtualToken.getCanonicalPath() + "/saida/scopes");
            if (!dirSaidaToken.exists()) {
                dirSaidaToken.mkdirs();
            }
            File newFile = new File(dirSaidaToken + "/" + newFileName);
            FileWriter writer = new FileWriter(newFile);
            for (ScopeNode s : scopes) {
                writer.write(s.toString());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
