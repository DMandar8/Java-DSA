
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
    

    private void preOrderTraversal(TreeNode root){

        if(root == null) return;

        System.out.print(root.data + " "); //Root
        preOrderTraversal(root.leftChild);   //Left
        preOrderTraversal(root.rightChild);  //Right

    }


    public void preOrderTraversal(){
        preOrderTraversal(root);
    }


    private void inOrderTraversal(TreeNode root){

        if(root == null) return;

        inOrderTraversal(root.leftChild); //Left
        System.out.print(root.data + " "); //Root
        inOrderTraversal(root.rightChild); //Right

    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }



    private void postOrderTraversal(TreeNode root){
        if(root == null) return;

        postOrderTraversal(root.leftChild); //Left
        postOrderTraversal(root.rightChild); //Right
        System.out.print(root.data + " "); //Root
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private int depth(TreeNode root, int value, int depth_var){

        if(root == null) return -1;

        if(root.data == value) return depth_var;

        if(root.data <= value){
            return depth(root.leftChild, value, depth_var + 1);
        }

        return depth(root.rightChild, value, depth_var + 1);

    }

    public int depth(int value){
        return depth(this.root, value, 0);
    }

    private int heightOfTree(TreeNode root){
        if(root == null) return -1;

        if(root.leftChild == null && root.rightChild == null) return 0;

        int treeHeight = 1 + Math.max(heightOfTree(root.leftChild), heightOfTree(root.rightChild));

        return treeHeight;
    }


    public int heightOfTree(){
        return heightOfTree(this.root);
    }

    private int heightOfNode(TreeNode root, int value){
        if(root == null) return -1;
        if(root.data == value) return heightOfTree(root);

        if(value <= root.data) return heightOfNode(root.leftChild, value);

        return heightOfNode(root.rightChild, value);
    }

    public int heightOfNode(int value){
        return heightOfNode(this.root, value);
    }

    private TreeNode getMin(TreeNode root){
        if(root == null) return null;
        if(root.leftChild == null) return root;

        return getMin(root.leftChild);
    }

    
    public TreeNode getMin(){
        return getMin(this.root);
    }

    private boolean isEqual(TreeNode root1, TreeNode root2){

        if(root1 == null && root2 == null) return true;

        if(root1 == null) return false;
        if(root2 == null) return false;

        return root1.data == root2.data &&
                isEqual(root1.leftChild, root2.leftChild) &&
                isEqual(root1.rightChild, root2.rightChild);
        
    }

    public boolean isEqual(MyBinarySearchTree tree){
        return isEqual(this.root, tree.root);
    }
    
}