import java.util.*;

import java.util.LinkedList;
import java.util.Queue;





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

//level order traversal
public static void levelorder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
       Node currNode= q.remove();
       if(currNode== null){
        System.out.println();
       if(q.isEmpty()){
             break;
       }else{
        q.add(null);
       }
    }else{
        System.out.print(currNode.data+" ");
        if(currNode.left!=null){
            q.add(currNode.left);
        }
        if (currNode.right!= null) {
            q.add(currNode.right);
            
        }
       }
        
    }

}
//Height of a Tree
public static int  HeightofTree(Node root){
    if(root == null){
        return 0;
    }
    int rh=HeightofTree(root.right);
    int lh=HeightofTree(root.left);
   return  Math.max(rh, lh)+1;
}

//Count of Nodes in tree
public static int count(Node root){
    if(root== null){
        return 0;
    }
    int leftcount=count(root.left);
    int rightcount=count(root.right);
    return leftcount+rightcount+1;
}

//Sum of Nodes
public static int sum (Node root){
    if(root == null){
        return 0;
    }
    int leftsum=sum(root.left);
    int rightsum=sum(root.right);
    return leftsum+rightsum+root.data;
}

    }
   public static void main(String[] args) {
    int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildtree(node);
    // System.out.println(root.data);
    //tree.preorder(root);
    // tree.Inorder(root);
    //tree.postorder(root);
    // tree.levelorder(root);

    //  int height = BinaryTree.HeightofTree(root);
    //     System.out.println("Height of the tree is: " + height);

    // int Totalcount=BinaryTree.count(root);
    // System.out.println("total Node count : "+Totalcount);

    int SumofNode=BinaryTree.sum(root);
    System.out.println("Total sum of nodes : "+SumofNode);
  
}

    
}
