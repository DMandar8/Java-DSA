package MyPackage;

public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(2);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);


        arr.removeAt(3);
        System.out.println(arr.indexOf(50));
        System.out.println(arr);//we are able to directly print arr because we have overridden the tiString function in our MyArray.java
        System.out.println(arr.max());
        System.out.println(arr.min());

        arr.reverse();
        System.out.println(arr);
        
    }
}
