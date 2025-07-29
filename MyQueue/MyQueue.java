package MyQueue;

import java.util.Arrays;

public class MyQueue {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;
    public MyQueue(int capacity){
        this.items = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = capacity;
        this.count = 0;
    }

    // public void enqueue(int value){
    //     if(rear == size){
    //         // System.out.println("Queue is already full...");  we commented this because we are trying to imitate offer()
    //         return;
    //     }
    //     items[rear] = value;
    //     rear++;
    // }

    // New enqueue() with fixed bug
    public void enqueue(int value){
        if(count == size){
            System.out.println("Queue is full...!!");
            return;
        }
        items[rear] = value;
        rear = (rear + 1) % size;  //this is our new formula
        count++;
    }


    // public int dequeue(){
    //     if(front+1 == rear){
    //         System.out.println("Queue is already empty...");
    //         return -1;
    //     }
    //     front++;
    //     int val = items[front];
    //     items[front] = 0;
    //     return val;
    // }

    //New dequeue() with fixed bug

    public int dequeue(){
        if(count == 0){
            System.out.println("Queue is already Empty...!");
            return -1;
        }
        front = (front + 1) % size;  //This is new formula
        int value = items[front];
        items[front] = 0;
        count--;
        return value;

    }




    public String toString(){
        return Arrays.toString(items);
    }

    
}
