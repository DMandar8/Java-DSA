package StackUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        MyStackUsingLL stack = new MyStackUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        
        System.out.println(stack);  // old stack

        System.out.println("------------");

       
        System.out.println(stack.pop()); // pop two elements
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        System.out.println("-------------");
        System.out.println(stack); //new stack


        System.out.println("--------");
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
    }
}
