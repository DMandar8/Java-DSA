package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        // queue.add(1);
        // queue.offer(4);
        // queue.remove();
        // queue.poll();
        // queue.poll();

        // System.out.println(queue);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println("Queue: "+ queue);

        // Reverse a queue using stack(Important)
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        System.out.println("Reversed Queue: "+ queue);
    }
}
