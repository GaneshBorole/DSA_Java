package BinarySearchTree;

public class BST1 {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
        }
    }
// Insert a node in BST
    // Time Complexity: O(h) where h is the height of the tree.
    public static Node insert(Node root,int val){
        if (root== null) {
            root=new Node(val);
            return root;
            
        }
        if (root.data > val) {
            root.left=insert(root.left, val);
            
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root== null) {
            return;
            
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // search key in BST  //O{H}
    public static boolean search(Node root,int key){
        if (root== null) {
            return false;
            
        }
        if (root.data== key) {
            return true;
            
        }
        if (root.data > key) {
           return  search(root.left, key);
            
        }else{
           return search(root.right, key);
        }
    }

    //delele Node  in Bst
    public static Node delete(Node root,int val){
        if (root.data < val) {
            root.right=delete(root.right, val);   
        }else if (root.data > val) {
            root.left=delete(root.left, val);
            
        }else{
            //case 1 : leaf node
            if (root.right == null && root.left== null) {
                return null;
                
            }
            //single child
            if (root.left== null) {
                return root.right;
                
            }
            else if (root.right== null) {
                return root.left;
                
            }
            //case 3 : two children
            Node Is=InorderSuccessor(root.right);
            root.data=Is.data;
           root.right= delete(root.right, Is.data);
        }
        return root;

    }

    public static Node InorderSuccessor(Node root){
        while (root.left != null) {
            root=root.left;
            
        }
        return root;
    }
    public static void main(String[] args) {
        //  int val[]={5,1,3,4,2,7};
        int val[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for (int i = 0; i < val.length; i++) {
            root=insert(root, val[i]);
            
        }
        inorder(root);
        System.out.println();

        
        // if (search(root, 1)) {
        //     System.out.println("key is found");
            
        // }else{
        //     System.out.println("key not found");
        // }

        root=delete(root, 11);
        System.out.println();
        inorder(root);
    }
    
}
