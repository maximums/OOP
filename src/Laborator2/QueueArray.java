package Laborator2;

public class QueueArray {
    private int maxSize;
    private int[] queue;
    private int count = 0;

    QueueArray(){
        maxSize = 1000000;
        queue = new int[maxSize];
    }
    QueueArray(int maxSize){
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }
    public void push(int element){
        queue[count] = element;
        count++;
    }

    public  int pop(){
        int element = 0;
        if(!isEmpty()){
            element = queue[0];
            for(int i = 0; i < queue.length-1; i++){
                queue[i] = queue[i+1];
            }
            count--;
            return element;
        }else{
            System.out.println("ERROR empty array");
            return -5451335;
        }
    }

    boolean isEmpty(){
        return count == 0;
    }

    boolean isFull(){
        return count == queue.length;

    }
}
