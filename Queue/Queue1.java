package queue;
import java.util.*;


public class Queue1 {
//     static class Queue {
//         int[] arr;
//         int size;
//         int rear;
//         int front;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }
//         public boolean isFull(){
//             return (rear+1) % size== front;
//         }

//         // Add
//         public void add(int data) {
//             if (isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }
//             if(front == -1){
//                 front =0;
//             }
//             rear=(rear+1) % size ;
//             arr[rear] = data;
//         }

//         // Remove
//         public int remove() {
//     if (isEmpty()) {
//         System.out.println("Queue is empty");
//         return -1;
//     }
//     int result = arr[front];
    
//     // Only one element in queue
//     if (front == rear) {
//         front = rear = -1;
//     } else {
//         front = (front + 1) % size;
//     }

//     return result;
// }
//         // Peek
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }



    //1.Queue using Linked list
    // static class Node{
    //     int data;
    //     Node next;

    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // static class Queue {
    //     static Node head=null;
    //     static Node tail=null;

    // public static boolean isEmpty(){
    //     return head==null && tail==null;
    // }
    // //add
    // public static void add(int data){
    //     Node newNode =new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     tail.next=newNode;
    //     tail=newNode;
    // }
    // //remove
    // public static int remove(){
    //     if(isEmpty()){
    //         System.out.println("queue is empty");
    //         return -1;
    //     }
    //     int front=head.data;
    //     if(tail ==head){
    //         tail=head=null;

    //     }else{
    //         head=head.next;
    //     }
    //     return front;
    // }
    //  // Peek
    //     public int peek() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    //  }
        
    

    //2.Queue using 2 Stacks
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
             q.remove();
            
        }
        
    }
    
}
