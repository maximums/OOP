package Laborator4;

import java.util.*;

public class Checker {
    private static Stack<Character> stack = new Stack<>();

    Checker(){};
    private List<String> formattingData(String data){
        List<String> expressions;
        expressions = Arrays.asList(data.split("([\\r?\\n]+)([\\r?\\n' ']+)"));
        return expressions;
    }

    public  void displayWrongExpressions(String data){
        for(int i = 0; i < formattingData(data).size(); i++){
            try {
                for(int j = 0; j < formattingData(data).get(i).length(); j++) {
                    if (formattingData(data).get(i).charAt(j) == '(')
                        stack.push(formattingData(data).get(i).charAt(j));
                    else if (formattingData(data).get(i).charAt(j) == ')')
                        stack.pop();
                }
                if(!stack.empty()) {
                    System.out.println(formattingData(data).get(i));
                    System.out.println("Expression number: " + i + " is wrong");
                }
                stack.clear();
            }catch (EmptyStackException e){
                System.out.println(formattingData(data).get(i));
                System.out.println("Expression number: " + i + " is wrong");
                stack.clear();
            }
        }
    }
}
