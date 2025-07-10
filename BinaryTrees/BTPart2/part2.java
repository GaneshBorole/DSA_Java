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
//    static class Info {
//     int diam;
//     int ht;
    
//     public Info(int diam, int ht){
//         this.diam = diam;
//         this.ht = ht;
//     }
//      public String toString() {
//         return "Diameter = " + diam + ", Height = " + ht;
//      }
// }

// public static Info diameter2(Node root) {
//     if (root == null) {
//         return new Info(0, 0);
//     }

//     Info leInfo = diameter2(root.left);
//     Info rightInfo = diameter2(root.right);

//     int ht = Math.max(leInfo.ht, rightInfo.ht) + 1;
//     int selfDiam = leInfo.ht + rightInfo.ht + 1;
//     int diam = Math.max(Math.max(leInfo.diam, rightInfo.diam), selfDiam);

//     return new Info(diam, ht);
// }


//3 .Subtree of Another Tree


public static boolean isIdentical(Node node,Node subroot){
    if(node == null && subroot==null){
        return true;
    }else if(node == null|| subroot== null || node.data != subroot.data){
        return false;
    }
    if(!isIdentical(node.left, subroot.left)){
        return false;
    }
    if(!isIdentical(node.right, subroot.right)){
        return false;
    }
    return true;

}
public static boolean subtree(Node root,Node subroot){
    if(root == null){
        return false;
    }
    if(root.data== subroot.data){
        if (isIdentical(root,subroot)){
            return true;

        }
    }
   return subtree(root.left, subroot) || subtree(root.right, subroot);


}


//Top View of a tree


static class Info {
    Node node;
    int hd;

    public Info(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }  
}

public static void TopView(Node root){
    //level order traversal
    Queue<Info> q =new LinkedList<>();
    HashMap<Integer,Node> map=new HashMap<>();
    int min=0,max=0;
    q.add(new Info(root,0));
    q.add(null);

    while (!q.isEmpty()) {
       Info curr = q.remove();
    if (curr == null) {
    if (q.isEmpty()) {
        break;
    } else {
        q.add(null);
        continue; 
    }
        }
        if (!map.containsKey(curr.hd)) {
            map.put(curr.hd, curr.node);
            
        }
        if (curr.node.left != null) {
            q.add(new Info(curr.node.left,curr.hd-1));
            min=Math.min(min,curr.hd-1);
            
        }
         if (curr.node.right != null) {
            q.add(new Info(curr.node.right,curr.hd+1));
            max=Math.max(max,curr.hd+1);
         }
    }
    for (int i = min; i <=max; i++) {
    System.out.print(map.get(i).data+" ");    
    }
    System.out.println();

}
    public static void main(String[] args) {
    int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildtree(node);
    //System.out.println("diameter of a tree is : "+diameter2(root).diam);

    // Node subroot=new Node(2);
    // subroot.left=new Node(4);
    // subroot.right=new Node(5);
    // System.out.println(subtree(root, subroot));
    
    TopView(root);

        
    }
    
}
