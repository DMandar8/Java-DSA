
public class Main {
    public static void main(String args[]){

        MyBinarySearchTree tree = new MyBinarySearchTree();
        MyBinarySearchTree tree2 = new MyBinarySearchTree();
        
        // int[] nums = { 7, 8, 1, 3, 2, 5, 10, 4};
        int[] nums = { 7, 3, 9, 1, 4, 8, 10 };
        int[] nums2 = { 7, 3, 10, 1, 4, 8, 10 };



        // tree.insert(10);
        // tree.insert(7);
        // tree.insert(70);
        // tree.insert(8);
        // tree.insert(45);
        for(int num: nums){
            tree.insert(num);
        }
        for(int val: nums2){
            tree2.insert(val);
        }

        // System.out.println(tree.find(4)); 

        // tree.preOrderTraversal();
        // tree.inOrderTraversal();
        // tree.postOrderTraversal();
        // System.out.println(tree.depth(10));
        // System.out.println(tree.heightOfTree());
        // System.out.println(tree.heightOfNode(7));
        // System.out.println(tree.getMin());
        System.out.println(tree.isEqual(tree2));



        
    }
}