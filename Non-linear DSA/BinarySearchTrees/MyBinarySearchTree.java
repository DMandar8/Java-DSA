
class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public String toString(){
        return "Value = " + this.data;
    }
}




public class MyBinarySearchTree {
    private TreeNode root; //By default Null

    public MyBinarySearchTree(){
        this.root = null;
    }


    // RECURSSIVE APPROACH insertion
    private TreeNode insert(TreeNode root, int value){
        // In this approach the root keeps changing as the insertion takes place.
        if(root == null){
            return new TreeNode(value);
        }

        if(value <= root.data){
            root.leftChild = insert(root.leftChild, value);
        }else{
            root.rightChild = insert(root.rightChild, value);
        }

        return root;
    }

    public void insert(int value){

        root = insert(root, value);


        // NORMAL APPROACH insertion
        // TreeNode node = new TreeNode(value);

        // if(root == null){
        //     root = node;
        //     System.out.println("Inserted "+ value +" at root");
        //     return;
        // }

        // TreeNode current = root;

        // while(true){
        //     if(value <= current.data){
        //         // GO LEFT
        //         if(current.leftChild == null){
        //             current.leftChild = new TreeNode(value);
        //             break;
        //         }
        //         current = current.leftChild;
        //     }else{
        //         // GO Right
        //         if(current.rightChild == null){
        //             current.rightChild = new TreeNode(value);
        //             break;
        //         }
        //         current = current.rightChild;
        //     }
        // }

    }
    
}