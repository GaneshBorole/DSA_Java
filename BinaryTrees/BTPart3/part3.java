package BinaryTrees.BTPart3;
import java.util.*;


public class part3 {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
           public String toString() {
        return String.valueOf(this.data);
    }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
//Kth level of a Tree
    // public static void KLevel(Node root, int level, int k) {
    //     if (root == null) {
    //         return;
    //     }
    //     if (level == k) {
    //         System.out.print(root.data + " ");
    //         return;
    //     }

    //     KLevel(root.left, level + 1, k);
    //     KLevel(root.right, level + 1, k);
    // }


    //Lowest common Ancestor(Approch 1)

    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root== null){
            return false;   
        }
        path.add(root);
        if (root.data==n) {
            return true;
            
        }
        boolean foundleft=getpath(root.left, n, path);
        boolean foundright=getpath(root.right, n, path);
        if (foundleft || foundright) {
          return true;            
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node Lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);
    //last common ancestor
    int i=0;
    for(;i<path1.size() && i< path2.size();i++){
        if (path1.get(i)!=path2.get(i)) {
            break;
            
        }
    }
   return path1.get(i-1);
    }

    //LCA approach(2)
    public static Node Lca2(Node root,int n1,int n2){
        if(root == null|| root.data== n1|| root.data==n2){
            return root;
        }
        Node leftlca=Lca2(root.left, n1, n2);
        Node rightLca=Lca2(root.right, n1, n2);

        if(rightLca== null){
            return leftlca;
        }
        if (leftlca== null) {
            return rightLca;
            
        }
        return root;
    }

    //min distance bet two nodes
    public static int lcaDist(Node root,int n){
        if (root== null) {
            return -1;
        }
        if (root.data==n) {
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right,n);

        if (leftDist== -1 && rightDist== -1) {
            return -1;
            
        }else if (leftDist== -1) {
            return rightDist+1;
            
        }else{
            return leftDist+1;
        }
    }
    public static int minDis(Node root ,int n1,int n2){
        Node lca=Lca2(root, n1, n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);
        return dist1+dist2;
    }

    //Find Kth ancestor

    public static int KAncestor(Node root,int k,int n){
        if (root== null) {
            return -1;
            
        }
        if (root.data== n) {
            return 0;
            
        }
        int leftdist=KAncestor(root.left, k, n);
        int rightdist=KAncestor(root.right, k, n);
        if (leftdist== -1 && rightdist== -1) {
            return -1;  
        }
        int max=Math.max(leftdist, rightdist);

        if (max+1==k) {
            System.out.println(root.data);
            
        }
        return max+1;
    }

    // Transform to Sum tree
    public static int transform(Node root){
        if (root== null) {
            return 0; 
        }
       int leftchild= transform(root.left);
       int rightchild=transform(root.right);
       int data= root.data;

       int newLeft=root.left==null ? 0: root.left.data;
       int newRight= root.right== null ? 0:root.right.data;
       root.data=newLeft + leftchild + newRight + rightchild;
       return data;

    }
    public static void preorder(Node root){
        if (root== null) {
            return;
            
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);

        // int k = 3;
        // KLevel(root, 1, k);

        //int n1=4; int k=2;
        //System.out.println(Lca2(root, n1, n2));
        // System.out.println(minDis(root, n1, n2));
       // System.out.println(minDis(root, n1, k));

       transform(root);
       preorder(root);
    }
}
