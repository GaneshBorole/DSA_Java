package LinkedList;
import java.util.*;

public class LinkedList1 {
     public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        } 
    }

    public static Node head;
    public static Node tail;

    public void AddFirst(int data){
        //step1 --> create a newnode
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 -->newNode next=head
        newNode.next = head;
        //step3 -->head= newNode
        head = newNode;
    }
    // add last in linked list
    public static void Addlast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //print LinkedList
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+"--> ");
            temp=temp.next;
            
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.print();
        ll.AddFirst(2);
        ll.print();
        ll.AddFirst(1);
        ll.print();
        ll.Addlast(3);
        ll.print();
        ll.Addlast(4);
        ll.print();
    }
}
    

