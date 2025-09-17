public class Main {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue(10);

        queue.enqueue(12);
        queue.enqueue(34);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(45);
        queue.enqueue(2);

        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
