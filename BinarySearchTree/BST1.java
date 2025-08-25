package BinarySearchTree;

import java.security.PublicKey;
import java.util.ArrayList;

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


    
  //Print in Range 
    public static void PrintInRange(Node root,int k1,int k2){
        if (root== null) {
            return;
            
        }
         if (root.data>= k1 && root.data <= k2) {
            PrintInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            PrintInRange(root.right,k1,k2);  
         }
         else if (root.data < k1) {
          PrintInRange(root.left,k1,k2);
            
         }
         else{
            PrintInRange(root.right,k1,k2);
         }
    }



    //Root To Leaf Node path
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ->");
        }
        System.out.println("Null");
    }
    public static void Root2Leaf(Node root,ArrayList<Integer> path){
        if (root== null) {
            return;
        }
        path.add(root.data);
        if (root.left== null && root.right== null) {
            printpath(path);  
        }
        Root2Leaf(root.left,path);
        Root2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    
    // check either validate Bst or Not

    public static boolean isValid(Node root,Node min,Node max){
        if (root==null) {
            return true;
            
        }
        if (min != null && root.data <= min.data) {
            return false;
            
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);

    }

    //Mirror image of a Binary Search tree
public static Node createMirror(Node root){
    if (root== null) {
        return null; 
    }
Node leftMirror=createMirror(root.left);
Node rightMirror=createMirror(root.right);
root.left=rightMirror;
root.right=leftMirror;
return root;

}
public static void preorder(Node root){
    if (root == null) {
        return;
        
    }
    System.out.println(root.data+" ");
    preorder(root.left);
    preorder(root.right);
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

        // root=delete(root, 11);
        // System.out.println();
        // inorder(root);

        //PrintInRange(root,5,12);
       // Root2Leaf(root, new ArrayList<>());

    //    if (isValid(root, null,null)) {
    //     System.out.println("valid BST");
        
    //    }else{
    //     System.out.println("not valid BST");
    //    }

    createMirror(root);
    }
    
}
