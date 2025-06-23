package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list  = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);


        // list.insertAtFront(8);

        // list.insertAt(25, 3);

        // list.reverse();

        // list.deleteStart();
        list.deleteEnd();


        System.out.println(list);
    }
}
