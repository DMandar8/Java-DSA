import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        
        queue.add(1);
        queue.add(5);
        queue.add(45);
        queue.add(23);

        System.out.println(queue);


        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
