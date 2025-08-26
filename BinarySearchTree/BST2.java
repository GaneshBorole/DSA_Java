import java.util.*;


public class BST2 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;

        }
    }
    public static void preorder(Node root){
        if (root == null) {
            return ;
            
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // 1. sorted array to create a Balanced BSt
    public static Node createBst(int arr[],int st,int end){
        if (st > end) {
            return null;
            
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBst(arr, st, mid-1);
        root.right=createBst(arr, mid+1, end);
        return root;
    }




    //2. convert Unbalanced Bst to  balanced BST
   public static void getinorder(Node root, ArrayList<Integer> inorder) {
    if (root == null) {
        return;  
    }
    getinorder(root.left, inorder);
    inorder.add(root.data);
    getinorder(root.right, inorder);
}

public static Node createBst(ArrayList<Integer> inorder, int st, int end) {
    if (st > end) {
        return null;
    }
    int mid = (st + end) / 2;
    Node root = new Node(inorder.get(mid));
    root.left = createBst(inorder, st, mid - 1);
    root.right = createBst(inorder, mid + 1, end);
    return root;
}

public static Node BalancedBst(Node root) {
    ArrayList<Integer> inorder = new ArrayList<>();
    getinorder(root, inorder);
    root = createBst(inorder, 0, inorder.size() - 1);
    return root;
}



// 3. size of BST in BT
static class Info{
    boolean isBSt;
    int size;
    int min;
    int max;

    public Info(boolean isBst,int size,int min, int max){
        this.isBSt=isBst;
        this.size=size;
        this.min=min;
        this.max=max;
    }
}
static int maxBst=0;

public static Info largestBst(Node root){
    if (root == null) {
        return new Info(true, 0,Integer.MAX_VALUE, Integer.MIN_VALUE);  
        
    }
    Info left=largestBst(root.left);
    Info right=largestBst(root.right);
    int size=left.size+right.size+1;
    int min=Math.min(root.data, Math.min(left.min, right.min));
    int max=Math.max(root.data, Math.max(left.max, right.max));

         // If subtree is BST
        if (left.isBSt && right.isBSt && root.data > left.max && root.data < right.min) {
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }
    return new Info(false, size, min, max);

}

// Merge 2 BSTs from a balanced BST
public static Node mergeBsts(Node root1,Node root2){
    ArrayList<Integer> arr1=new ArrayList<>();
    getinorder(root1, arr1);

    ArrayList<Integer> arr2=new ArrayList<>();
    getinorder(root2, arr2);

int i=0,j=0;
ArrayList <Integer> finalarr=new ArrayList<>();
while (i<arr1.size()&& j<arr2.size()) {
    if (arr1.get(i)<= arr2.get(j)) {
        finalarr.add(arr1.get(i));
        i++;
        
    }else{
        finalarr.add(arr2.get(j));
        j++;
    }
}
while (i<arr1.size()) {
    finalarr.add(arr1.get(i));
    i++;
    
}
while (j<arr2.size()) {
     finalarr.add(arr2.get(j));
        j++;
    
    
}
return createBst(finalarr, 0, finalarr.size()-1);

}

    public static void main(String[] args) {
    //     int arr[]={3,5,6,8,10,11,12};
    //    Node root= createBst(arr, 0, arr.length-1);
    //    preorder(root);


        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.right = new Node(60);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);


        Node root1 = new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

         Node root2=new Node(9);
         root2.left=new Node(3);
         root2.right=new Node(12);

        // root = BalancedBst(root);
        // preorder(root);
    //   Info info=largestBst(root);
    //   System.out.println("largest Bst is :"+maxBst);

    Node root=mergeBsts(root1, root2);
    preorder(root);

        
    }
    
}
