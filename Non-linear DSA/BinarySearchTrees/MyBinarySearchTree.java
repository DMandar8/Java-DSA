
class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    @Override
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


    // Recurssive solution for finding the node in binary search tree

    // private TreeNode find(TreeNode root, int value){

    //     if(root == null) return null;

    //     if(root.data == value){
    //         return root;
    //     }

    //     if(value < root.data){
    //         // Search int the left subtree
    //         return find(root.leftChild, value);
    //     }
    //     return find(root.rightChild, value);

    // }
    // End of recurssive approach


    // This is the iterative solution for finding a node in the binary search tree
        private TreeNode find(TreeNode root, int value){

            if(root == null) return null;

            if(root.data == value){
                return root;
            }

            while(root.data != value){
                if(value <= root.data){
                    root = root.leftChild;
                }else{
                    root = root.rightChild;
                }

                if(root == null) return null;
            }

            return root;
        }
    // End of iterative approach


    public TreeNode find(int value){
        return find(root,value);
        // System.out.println();
    }
    
}