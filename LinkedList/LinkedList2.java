package LinkedList;

public class LinkedList2 {

    public static Node head; // Declare head here

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    //  1 Detect cycle in linked list using Floyd's Cycle Detection Algorithm
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }



// 2 remove cycle in linked list
public static void removecycle(){
    Node slow=head;
    Node fast=head;
    boolean exists=false;
    while (fast !=null && fast.next!= null) {
        slow= slow.next;
        fast=fast.next.next;
        if (slow == fast) {
          exists=true;
          break;         
        }   
    }
    if(exists==false){
        return;
    }
    //find meeting points
    slow =head;
    Node prev= null;
    while (slow != fast) {
        prev=fast;
        slow=slow.next;
        fast=fast.next;
        
    }
    //remove  cycle ->last.next=null
    prev.next=null;

}

  
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next=temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // creating a loop
        System.out.println(isCycle()); 
        removecycle();
        System.out.println(isCycle());
    }
}
