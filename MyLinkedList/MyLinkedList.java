package MyLinkedList;

class Node{
    //singly linked list
    public int data;
    public Node next = null;

    public Node(int value){
        this.data=value;
    }
}

public class MyLinkedList{
    private Node head;
    private Node tail;

    public MyLinkedList(){
        head=null;
        tail=null;
    }

    public void insert(int value){
        //first create a node.....linking afterwards

        Node node = new Node(value);

        if(head==null && tail==null)//empty linked list
        {
            // head=node;
            // tail=node;
            //we can also write like
            head=tail=node;

        }else //Linked List has some elements already

        {   
            
            //this code was without tail pointer ....which give O(n) time complexity during insertion
            // Node currNode = head;
            //to traverse till last node to insert we need a pointer 

            // while(currNode.next != null)
            //this pointer will go until the currentNode's next is null ...as last element is always pointing towards null
            // {
            //     currNode = currNode.next;
            // }

            // currNode.next = node;
//-------------------------------------------------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------------------------------------------------//


            //Now below is the code with tail pointer with O(1) time complexity

            tail.next=node;//point the last node towards the new node first
            tail=node; // again tail points to new last node

        }
    }

    public boolean isEmpty(){
       return (head==null && tail==null);
    }

    public int sum(){
        Node currNode = head;
        int sum = 0;

        while(currNode!=null){
            sum +=currNode.data;
            currNode=currNode.next;
        }
        return sum;
    }

    public void insertAtFront(int value){
        Node node = new Node(value);

        if(head==null){//if linked list is empty
            head=tail=node;
        }

        node.next=head;
        head=node;
    }
    
    public void insertAt(int value, int index){

        if(isEmpty()) throw new IllegalArgumentException();

        Node node = new Node(value);
        
        Node currNode=head;

        int i = 0;


    
        while(i!=(index-1)){

            currNode=currNode.next;
            i++;
        }

        node.next=currNode.next;
        currNode.next=node;
        
        

    }

    public void reverse(){

        if(head==null || head.next==null){
            return;
        }
        Node prev = null;
        Node currNode = head;
        tail = head;
        Node nextNode = head.next;

        while(nextNode!=null){
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        currNode.next = prev;

        head=currNode;
    }


    public void deleteStart(){
        if(isEmpty()) return;

        Node currNode = head;

        head = head.next; // now head is pointing to the second element
        currNode.next = null;  // and here the first element is now pointing towards null 

        // there is no need of manually deleting the node ....because the java has automatic garbage collector which will automatically identify the node and delete it.
         
    }


    public void deleteEnd(){
        if(isEmpty()) return;
        if(head == tail){
            head = tail = null;
            return;
        }

        Node currNode = head;

        while(currNode.next != tail){
            currNode = currNode.next;
        }
        currNode.next = null;
        tail = currNode;

        // we can also implement this without tail as in online problems we might not have a tail....so the second solution is is notebook ....with two indexes
    }

    public String toString(){  // similar to array, here also there is a in-built toString class which is responsible to print the linked-list in console window
        Node currNode = head;

        StringBuilder result = new StringBuilder();

        while (currNode!=null) {

            result.append(currNode.data);

            if(currNode.next!=null){//just to give --> arrow
                result.append("-->");

            }

            currNode=currNode.next;
        }

        return result.toString();
    }
}
