package Laborator2;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private int maxSize;
    List<Integer> list1 = new ArrayList<Integer>(maxSize);

    Queue(int maxSize){
        this.maxSize = maxSize;
    }
    Queue(){
        maxSize = 1000000;
    }

    public void push(int element){
        list1.add(element);
    }

    public int pop(){
        int element = 0;
        if(list1.size() != 0){
            element = list1.get(0);
            list1.remove(0);
            return element;
        }
        else {
            System.out.println("ERROR queue is empty");
            return -452481313;
        }
    }

    boolean isEmpty(){
        return list1.size() == 0;
    }

    boolean isFull(){
        return list1.size() == maxSize;
    }

}
