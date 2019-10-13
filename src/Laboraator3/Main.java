package Laboraator3;

import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws Exception {

        String delimiters = "?!.";
        String data = readFileAsString("C:\\Users\\super\\IdeaProjects\\OOP\\1.txt");
        TextManipulation textManipulation = new TextManipulation( data);

            textManipulation.displayTop5Often();
            System.out.println("Number of words:" + textManipulation.countNumberOfWords(data));
            System.out.println("Number of sentences:" + textManipulation.countNumberOfSentences(data));
            System.out.println("Number of vowels:" + textManipulation.countNumberOfVowels(data));
            System.out.println("Number of consonants:" + textManipulation.countNumberOfConsonants(data));
            System.out.println("Number of letters:" + textManipulation.countNumberOfLetters(data));
            System.out.println("Longest word is: " + "'" +textManipulation.Words(data)+"'" + " with length: " + textManipulation.Words(data).length());

    }

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static String[] formattingWords(String data, String delimiters) {

        String[] hzCum = data.split("\\s+");
        StringBuilder[] sb = new StringBuilder[hzCum.length];
        for (int i = 0; i < hzCum.length; i++) {
            for (int m = 0; m < hzCum[i].length(); m++) {
                if (delimiters.indexOf(hzCum[i].charAt(m)) != -1) {
                    sb[i] = new StringBuilder(hzCum[i]);
                    sb[i] = sb[i].deleteCharAt(sb[i].length() - 1);
                } else
                    sb[i] = new StringBuilder(hzCum[i]);
            }
        }
        for (int i = 0; i < hzCum.length; i++) {
            hzCum[i] = String.valueOf(sb[i]);
        }
        return hzCum;
    }
}
