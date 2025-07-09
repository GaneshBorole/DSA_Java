package BinaryTrees.BTPart2;
import java.util.*;

import BinaryTrees.BTPart2.part2.BinaryTree;


public class part2 {
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
    }
    //Height of a tree
    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);
        return Math.max(lh, rh)+1;
    }
    //Diameter of a tree  //approach 1  O(n^2)
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }
        int leftDia=diameter(root.left);
        int rightDia=diameter(root.right);
        int  lh=Height(root.left);
        int rh=Height(root.right);
        int selfDia=lh+rh+1;

        return Math.max(selfDia,Math.max(rightDia,leftDia));
    }

    //Diameter of tree  //Approach 2 O(n)
   static class Info {
    int diam;
    int ht;
    
    public Info(int diam, int ht){
        this.diam = diam;
        this.ht = ht;
    }
     public String toString() {
        return "Diameter = " + diam + ", Height = " + ht;
     }
}

public static Info diameter2(Node root) {
    if (root == null) {
        return new Info(0, 0);
    }

    Info leInfo = diameter2(root.left);
    Info rightInfo = diameter2(root.right);

    int ht = Math.max(leInfo.ht, rightInfo.ht) + 1;
    int selfDiam = leInfo.ht + rightInfo.ht + 1;
    int diam = Math.max(Math.max(leInfo.diam, rightInfo.diam), selfDiam);

    return new Info(diam, ht);
}

    public static void main(String[] args) {
    int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildtree(node);
    System.out.println("diameter of a tree is : "+diameter2(root).diam);

        
    }
    
}
