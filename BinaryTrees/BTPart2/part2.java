package BinaryTrees.BTPart2;
import java.util.*;
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
    //Diameter of a tree
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
    public static void main(String[] args) {
    int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildtree(node);
    System.out.println("diameter of a tree is : "+diameter(root));

        
    }
    
}
