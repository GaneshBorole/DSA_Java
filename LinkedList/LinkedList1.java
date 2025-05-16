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
    public static int  size;


    public void AddFirst(int data){
        //step1 --> create a newnode
        Node newNode = new Node(data);
        size++;
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
        size++;
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

    // Add element in middle of LL
    public void Addinmiddle(int idx, int data) {
    if(idx == 0){
        AddFirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
        temp = temp.next;
        i++;
    }
    //i=idx-1
    newNode.next = temp.next;
    temp.next = newNode;
}

//remove first element
public int removeFirst(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=head.data;
    size--;
    head=head.next;
    return val;
}

//remove last element
public int removelast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;

    }else if(size==1){
    int val=tail.data;
    head=tail=null;
    size=0;
    return val;
    }
    //prev; i=size-2
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;

    }
    int val=prev.next.data; //tail.data
    prev.next=null;
    tail=prev;
    size--;
    return val;

}

//search key in a LL(iterative)
public int iterativeSerach(int key){ //O(n)
    Node temp=head;
    int i=0;
    while (temp != null) {
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
        
    }
    return -1;//key doesn't exist

}
//search element(recursion)
public int helper(Node head,int key){ // O(n)
    if(head == null){
        return -1;
    }
    if(head.data== key){
        return 0;
    }
    int idx= helper(head.next, key);
    if(idx== -1){
        return -1;
    }
    return idx+1;
}
public int recursiveSearch(int key){
 return helper(head, key);
}

//Reverse a LL

public void reverseLL(){
    Node prev=null;
    Node curr=tail=head;
    Node next;

    while (curr != null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        
    }
    head=prev;
}




//delete Nth index from N
public void deleteNthfromN(int n){
    int sz=0;
    Node temp=head;
    while (temp != null) {
        temp=temp.next;
        sz++;
        
    }
    if(n == sz){
        head=head.next;
        return;

    }
    //sz-n
    int i=1;
    int iTofind=sz-n;
    Node prev=head;
    while (i < iTofind) {
        prev=prev.next;
        i++;
        
    }
    prev.next=prev.next.next;
    return;

}



//palindrome of LL
//slow-fast approach
public Node findmid(Node head){
    Node slow= head;
    Node fast=head;

    while (fast != null && fast.next != null) {
        slow=slow.next;//+1
        fast=fast.next.next;//+2   
    }
    return slow;//slow is my mid element of LL
}

public boolean checkPalindrome(){
    if(head == null || head.next == null){
        return true;
    }
    //1.find mid
    Node midNode=findmid(head);
    //2.reverse the 2nd half
    Node prev=null;
    Node curr=midNode;
    Node next;
    while (curr != null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        
    }
    Node right= prev;//right half head
    Node left=head;//

    //check left half & right half
    while (right != null) {
        if(left.data != right.data){
            return false;
        }
        left=left.next;
        right=right.next;
        
    }
    return true;

}
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        
        ll.Addlast(1);
        ll.Addlast(2);
        ll.Addlast(2);
        ll.Addlast(1);
        //ll.Addinmiddle(2,3);
        ll.print();
       // System.out.println(ll.size);
    //    ll.removeFirst();
    //    ll.print();
    //    ll.removelast();
    // System.out.println(ll.iterativeSerach(6));
   //System.out.println(ll.recursiveSearch(3));
    //   ll.reverseLL();
    //   ll.print();
   //ll.deleteNthfromN(3);
   //ll.print();
   System.out.println(ll.checkPalindrome());

    }
}
    

