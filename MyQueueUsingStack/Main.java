
public class Main {
    public static void main(String[] args) {
        MyQueueUsingStack queueUsingStack = new MyQueueUsingStack();

        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);
        queueUsingStack.enqueue(3);

        System.out.println(queueUsingStack.dequeue());
                System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());


        queueUsingStack.enqueue(4);
        queueUsingStack.enqueue(5);

        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
    }
}
