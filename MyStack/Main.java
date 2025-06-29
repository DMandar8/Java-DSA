package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // stack.push(6); //stack overflow condition


        // System.out.println("Size of the stack is " + stack.size());

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();   //stack underflow condition

        // System.out.println(stack.peek());  // peek returns the topmost element in the stack
        // System.out.println("-----");

        // System.out.println(stack.isEmpty());

        System.out.println(stack);
    }
}
