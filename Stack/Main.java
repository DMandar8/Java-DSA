package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(7);
        stack.push(9);

        // System.out.println(stack.pop()); // pop() method returns and removes the last element
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());  //example of stack underflow condition



        // System.out.println(stack.isEmpty()); 
        // System.out.println(stack.peek());    //just returns the stack top

        // System.out.println(stack); // normal print

        while (!stack.isEmpty()) {
            Integer val = stack.pop();
            System.out.println(val);
        }


    }
}
