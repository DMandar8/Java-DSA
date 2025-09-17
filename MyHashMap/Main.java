package MyHashMap;

public class Main {
// We created our own hash map using linked list
// We handled colision using chaining
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, "Mandar");
        map.put(2,"Abc");
        map.put(3,"Xyz");
        map.put(6,"WWW");

        System.out.println(map);
        System.out.println(map.get(6));
        map.remove(6);
        System.out.println(map);
        // map.remove(21);
    }
}
