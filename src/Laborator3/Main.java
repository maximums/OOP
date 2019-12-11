package Laborator3;

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

        String[] arrayOfWords = data.split("\\s+");
        StringBuilder[] sb = new StringBuilder[arrayOfWords.length];
        for (int i = 0; i < arrayOfWords.length; i++) {
            for (int m = 0; m < arrayOfWords[i].length(); m++) {
                if (delimiters.indexOf(arrayOfWords[i].charAt(m)) != -1) {
                    sb[i] = new StringBuilder(arrayOfWords[i]);
                    sb[i] = sb[i].deleteCharAt(sb[i].length() - 1);
                } else
                    sb[i] = new StringBuilder(arrayOfWords[i]);
            }
        }
        for (int i = 0; i < arrayOfWords.length; i++) {
            arrayOfWords[i] = String.valueOf(sb[i]);
        }
        return arrayOfWords;
    }
}
