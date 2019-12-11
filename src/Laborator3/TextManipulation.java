package Laborator3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextManipulation {
    String delimiters = "?!.";
    String data;
    private int numberOfSentences = 0;
    private int numberOfVowels = 0;
    private int numberOfConsonants = 0;
    private char[] Vowels = {'A', 'E', 'I', 'O', 'U'};
    private char[] Consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

    TextManipulation(String data){
        this.data = data;
    }

    public int countNumberOfSentences(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (delimiters.indexOf(data.charAt(i)) != -1) {
                numberOfSentences++;
            }
        }
        return numberOfSentences;
    }

    public int countNumberOfWords(String data) {
        if (data == null || data.isEmpty()) {
            return 0;
        }
        String[] words = data.split("\\s+");
        return words.length;
    }

    public int countNumberOfVowels(String data) {
        if (data == null || data.isEmpty()) {
            return 0;
        }
        data = data.toUpperCase();
        char[] arr = data.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < Vowels.length; j++) {
                if (arr[i] == Vowels[j]) {
                    numberOfVowels++;
                }
            }
        }
        return numberOfVowels;
    }

    public int countNumberOfConsonants(String data) {
        if (data == null || data.isEmpty()) {
            return 0;
        }
        data = data.toUpperCase();
        char[] arr = data.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < Consonants.length; j++) {
                if (arr[i] == Consonants[j]) {
                    numberOfConsonants++;
                }
            }
        }
        return numberOfConsonants;
    }

    public int countNumberOfLetters(String data) {
        return countNumberOfVowels(data) / 2 + countNumberOfConsonants(data) / 2;
    }

    public StringBuilder Words(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        String[] words = data.split("\\s+");
        int longestWord = 0;
        int j = 0;
        StringBuilder[] sb = new StringBuilder[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int m = 0; m < words[i].length(); m++) {
                if (delimiters.indexOf(words[i].charAt(m)) != -1) {
                    sb[i] = new StringBuilder(words[i]);
                    sb[i] = sb[i].deleteCharAt(sb[i].length() - 1);
                } else
                    sb[i] = new StringBuilder(words[i]);
            }
        }
        for (int i = 0; i < sb.length; i++) {
            if (longestWord < sb[i].length()) {
                longestWord = sb[i].length();
                j = i;
            }
        }
        return sb[j];
    }

    public void displayTop5Often()
    {
        Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(data);
        Hashtable<String, Integer> topWords = new Hashtable<String, Integer>();

        while (matcher.find())
        {
            String tmp = matcher.group();
            topWords.put(tmp, topWords.containsKey(tmp) ? topWords.get(tmp) + 1 : 1);
        }
        System.out.println("Top 5 often words are: ");
        ArrayList sortedTop = sortList(topWords);
        for (int i = 0; i < (Math.min(sortedTop.size(), 5)); i++) {
            System.out.println(sortedTop.get(i));
        }
    }

        private static ArrayList sortList(Hashtable<?, Integer> t)
        {
            ArrayList<Map.Entry<?, Integer>> list = new ArrayList(t.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<?, Integer>>()
            {
                public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2)
                {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            return list;
        }
}
