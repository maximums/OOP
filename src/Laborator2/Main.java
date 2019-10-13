package Laborator2;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box( 2);
        Box box2 = new Box(2 , 3 , 4);

        System.out.println("\nVolume is : " + box2.getVolume());
        System.out.println("Surface is : " + box2.getSurface() + "\n");

//        Queue queue = new Queue();
//        queue.push(2);
//        queue.push(3);
//        queue.push(3);
//        queue.push(3);
//        queue.push(3);
//        queue.push(3);
//        queue.push(3);
//        queue.push(3);
//        queue.push(3);
//        queue.push(3);
//        System.out.println(queue.pop());
//        queue.push(4);
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.isFull() + "\n");

        QueueArray queueArray = new QueueArray(2);
        queueArray.push(5);
        queueArray.push(7);
        System.out.println(queueArray.pop());
        queueArray.push(55);
        System.out.println(queueArray.isEmpty());
        System.out.println(queueArray.isFull());
    }
}
