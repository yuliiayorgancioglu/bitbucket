package HomeWork_022;

public class RunQue {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(5);

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(9);

        System.out.println("Initial queue with customSize:");
        System.out.println(myQueue);
        myQueue.add(1);
        System.out.println("Rearranged queue with customSize when the capacity is reached:");
        System.out.println(myQueue);

        MyQueue myQueue1 = new MyQueue();
        for (int i=0; i< 20; i++){
            myQueue1.add(i*2);
        }

        System.out.println("Queue with defaultSize =16:");
        System.out.println(myQueue1);

    }
}
