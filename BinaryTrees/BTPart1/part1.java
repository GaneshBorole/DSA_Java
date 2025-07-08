package BinaryTrees.BTPart1;

import BinaryTrees.BTPart1.part1.BinaryTree;

public class part1 {
    static class Node {
        int data;
        Node left;
        Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }   
    }
    static class BinaryTree {
        static int idx=-1;
        public static Node buildtree(int node[]){
            idx++;
            if(node[idx]== -1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            newNode.left=buildtree(node);
            newNode.right=buildtree(node);
            return newNode;

        }
        //preorder traversal
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    
    //inorder traversal 
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print((root.data)+" ");
        Inorder(root.right);
    }
//post order traversal
public static void postorder(Node root){
    if(root == null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}
    }
   public static void main(String[] args) {
    int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildtree(node);
    // System.out.println(root.data);
    //tree.preorder(root);
    // tree.Inorder(root);
    tree.postorder(root);
}

    
}
