package MyStack;

import java.util.EmptyStackException;

public class MyStack {
    private int[] items;
    private int top;
    private int size;

    public MyStack(int size){
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }

    public void push(int value){

        // if(this.top == this.size){
        //     System.out.println("Stack is Full");
        //     return;
        // }

        if(this.top == this.size){
            throw new StackOverflowError();  // stack overflow condition
        }

        this.items[top] = value;
        this.top++;
    }

    public int size(){
        return this.top;
    }

    public int pop(){

        // if(this.top == 0){
        //     System.out.println("Stack is already Empty.");
        //     return -1;
        // }

        if(this.top == 0){
            throw new EmptyStackException();  // stack underflow condition
        }

        this.top--;
        int value = this.items[top];
        this.items[top] = 0;
        return value;
    }

    public int peek(){
        return this.items[top-1];
    }

    public boolean isEmpty(){
        if(this.top == 0){
            return true;
        }

        return false;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = this.size-1; i>=0; i--){
            stringBuilder.append(this.items[i]).append("\n");
        }
        return stringBuilder.toString();
    }
}
