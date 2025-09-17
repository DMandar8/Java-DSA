import java.util.Arrays;

public class MyPriorityQueue {
     private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;
    public MyPriorityQueue(int capacity){
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
    //This is priorityQueue.....here i just copied complete normal queue from scratch just the diference we have to do is is in the enqueue method, i.e. during storing the elements in queue
    public void enqueue(int value){
        if(count == size){
            System.out.println("Queue is full...!!");
            return;
        }

        int i = 0;

        for(i = rear; i > 0; i--){
            if(items[i-1] <= value){
                break;
            }
            if(items[i-1] > value){
                items[i] = items[i-1];
            }
        }
        items[i] = value;
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
