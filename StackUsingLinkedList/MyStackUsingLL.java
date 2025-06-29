package StackUsingLinkedList;

import java.util.EmptyStackException;

class Node {
    public int data;
    public Node next = null;

    public Node(int value) {
        this.data = value;
    }
}

public class MyStackUsingLL {
    Node head;
    Node tail;

    public MyStackUsingLL() {
        this.head = null;
        this.tail = null;
    }

    public void push(int value) {
        Node node = new Node(value);

        if (head == null && tail == null) {

            this.head = node;
            this.tail = node;
            node.next = null;

        }else{

            node.next = head;  // here we always insert the new node a the starting position of the linked list
            head = node;


        }

    }

    public int pop(){

        if(head == null) throw new EmptyStackException();

        Node currNode = head;
        head = head.next;
        currNode.next = null;
        return currNode.data;

    }

    public int peek(){
        if(head == null) throw new EmptyStackException();

        return head.data;
    }

    public boolean isEmpty(){
        if(head == null) return true;

        return false;
    }

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        Node currNode = head;

        while(currNode != null){
            stringBuilder.append(currNode.data).append("\n");
            currNode = currNode.next;
        }

        return stringBuilder.toString();

    }
}
