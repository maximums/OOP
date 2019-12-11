package Laborator4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String expressions = readFileAsString("C:\\Users\\super\\Desktop\\2.txt");
        Checker checker = new Checker();
        checker.displayWrongExpressions(expressions);
    }
    public static String readFileAsString(String path) {
        String expressions = "";
        try {
            expressions = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expressions;
    }
}
