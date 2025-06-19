// package LinkedList;

// import java.lang.classfile.components.ClassPrinter.Node;
// import java.util.LinkedList;

// public class LinkedList2 {

//     Node head;

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     // add at the start of the list
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
    
//     // print the whole list
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }

//     // //  1 Detect cycle in linked list using Floyd's Cycle Detection Algorithm
//     // public static boolean isCycle(){
//     //     Node slow = head;
//     //     Node fast = head;

//     //     while(fast != null && fast.next != null){
//     //         slow = slow.next;
//     //         fast = fast.next.next;
//     //         if(slow == fast){
//     //             return true;
//     //         }
//     //     }
//     //     return false;
//     // }



// // 2 remove cycle in linked list
// // public static void removecycle(){
// //     Node slow=head;
// //     Node fast=head;
// //     boolean exists=false;
// //     while (fast !=null && fast.next!= null) {
// //         slow= slow.next;
// //         fast=fast.next.next;
// //         if (slow == fast) {
// //           exists=true;
// //           break;         
// //         }   
// //     }
// //     if(exists==false){
// //         return;
// //     }
// //     //find meeting points
// //     slow =head;
// //     Node prev= null;
// //     while (slow != fast) {
// //         prev=fast;
// //         slow=slow.next;
// //         fast=fast.next;
        
// //     }
// //     //remove  cycle ->last.next=null
// //     prev.next=null;

// // }



// // merge sort in LL

// private Node getMid(Node head) {
//     Node slow = head;
//     Node fast = head.next;

//     while (fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;
//     }
//     return slow; // slow is the midpoint
// }

// private Node merge(Node head1, Node head2) {
//     Node dummy = new Node(-1);
//     Node temp = dummy;

//     while (head1 != null && head2 != null) {
//         if (head1.data <= head2.data) {
//             temp.next = head1;
//             head1 = head1.next;
//         } else {
//             temp.next = head2;
//             head2 = head2.next;
//         }
//         temp = temp.next;
//     }
//     while (head1 != null) {
//         temp.next = head1;
//         head1 = head1.next;
//         temp = temp.next;
//     }
//     while (head2 != null) {
//         temp.next = head2;
//         head2 = head2.next;
//         temp = temp.next;
//     }
//     return dummy.next;
// }

// public Node mergeSort(Node head) {
//     if (head == null || head.next == null) {
//         return head;
//     }
//     // find the midpoint first
//     Node mid = getMid(head);
//     Node right = mid.next;
//     mid.next = null;

//     Node left = mergeSort(head);
//     Node newright = mergeSort(right);

//     return merge(left, newright);
// }


//     public static void main(String[] args) {
//         // head = new Node(1);
//         // Node temp = new Node(2);
//         // head.next=temp;
//         // head.next.next = new Node(3);
//         // head.next.next.next = temp; // creating a loop
//         // System.out.println(isCycle()); 
//         // removecycle();
//         // System.out.println(isCycle());



        




//     //3 Linkedlist using jcf
//         LinkedList<Integer>ll=new LinkedList<>();
//         // ll.addLast(1);
//         // ll.addLast(2);
//         // ll.addFirst(0);
//         // System.out.println(ll);
//         // ll.removeLast();
//         // ll.removeFirst();
//         // System.out.println(ll);

//         ll.addFirst(5);
//         ll.addFirst(6);
//         ll.addFirst(7);
//         ll.addFirst(8);
//         ll.addFirst(9);

//         System.out.println(ll);
//         head=ll.merge(head);
//         System.out.println(ll);
                
//     }





//merge sort in LinkedList

// package LinkedList;

// public class LinkedList2  {

//     static Node head;

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }
  
//     private static Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
  
//     private static Node merge(Node head1, Node head2) {
//         Node dummy = new Node(-1);
//         Node temp = dummy;

//         while (head1 != null && head2 != null) {
//             if (head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//             }
//             temp = temp.next;
//         }
//         while (head1 != null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }
//         while (head2 != null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }
//         return dummy.next;
//     }
  
//     public static Node mergeSort(Node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         Node mid = getMid(head);
//         Node right = mid.next;
//         mid.next = null;

//         Node left = mergeSort(head);
//         Node newright = mergeSort(right);

//         return merge(left, newright);
//     }
  
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }
  
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
  



//zigzag LL
//     public class LinkedList2<T> {
//     Node head;

//     class Node {
//         T data;
//         Node next;

//         Node(T data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addLast(T data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null)
//             temp = temp.next;
//         temp.next = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public void zigzag() {
//         // Find mid
//         Node slow = head;
//         Node fast = head.next;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         Node mid = slow;

//         // Reverse second half
//         Node curr = mid.next;
//         mid.next = null;
//         Node prev = null;
//         Node next;
//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         // Zigzag merge
//         Node left = head;
//         Node right = prev;
//         Node nextL, nextR;
//         while (left != null && right != null) {
//             nextL = left.next;
//             left.next = right;
//             nextR = right.next;
//             right.next = nextL;

//             left = nextL;
//             right = nextR;
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList2<Integer> ll = new LinkedList2<>();
//         ll.addLast(5);
//         ll.addLast(6);
//         ll.addLast(7);
//         ll.addLast(8);

//         System.out.println("Original List:");
//         ll.print();

//         ll.zigzag();

//         System.out.println("Zigzag List:");
//         ll.print();
//     }
// }



//Doubly LL
public class LinkedList2 {
    public class Node {
        int data;
        Node next;
        Node prev;


        public Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        } 

    }
    public static Node head;
    public static Node tail;
    public static int size;


    //addFirst
    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head== null){
            head=tail=newNode;
            return;
        }
    newNode.next=head;
    newNode.prev=newNode;
    head=newNode;
    }


    //remove first
    public int removefirst(int data){
        if(head== null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1 ){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
 //print
 public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
    
    while( curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
    }
    head=prev;
    }

    public static void main(String[] args) {
    LinkedList2 dll=new LinkedList2();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        
        dll.print();
        dll.reverse();
        dll.print();



        // dll.print();
        // System.out.println(dll.size);

        // dll.removefirst(size);
        // dll.print();
        // System.out.println(dll.size);
        
    }

}


