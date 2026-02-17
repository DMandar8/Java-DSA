
public class Main {
    public static void main(String args[]){
        MyBinarySearchTree tree = new MyBinarySearchTree();

        int[] nums = { 7, 8, 1, 3, 2, 5, 10, 4};

        for(int num: nums){
            tree.insert(num);
        }

        // tree.insert(10);
        // tree.insert(7);
        // tree.insert(70);
        // tree.insert(8);
        // tree.insert(45);
    }
}