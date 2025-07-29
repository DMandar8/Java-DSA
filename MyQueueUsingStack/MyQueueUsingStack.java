
import java.util.Stack;

public class MyQueueUsingStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    private int size;

    public MyQueueUsingStack(){
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void enqueue(int value){

        s1.push(value);
        return;

    }
    public int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty..!");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                this.s2.push(s1.pop());
            }
        }
       
        return s2.pop();
    }
}
