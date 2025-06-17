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

package LinkedList;

public class LinkedList2 {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
  
    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
  
    private static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
  
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node newright = mergeSort(right);

        return merge(left, newright);
    }
  
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
  
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();

        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        
        ll.print();

        head = mergeSort(head);
        ll.print();

    }
}
