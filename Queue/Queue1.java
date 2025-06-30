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
    // static class Queue {
    //     Stack<Integer> s1 = new Stack<>();
    //     Stack<Integer> s2 = new Stack<>();

    //     public boolean isEmpty() {
    //         return s1.isEmpty();
    //     }

    //     // add
    //     public void add(int data) {
    //         while (!s1.isEmpty()) {
    //             s2.push(s1.pop());
    //         }

    //         s1.push(data);

    //         while (!s2.isEmpty()) {
    //             s1.push(s2.pop());
    //         }
    //     }

    //     // remove
    //     public int remove() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return s1.pop();
    //     }

    //     // peek
    //     public int peek() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return s1.peek();
    //     }
    // }


    //3.Stack using 2 Queue
 
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push element to the stack
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop element from the stack
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        // Peek top element of the stack
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println("Top: " + s.peek());
            s.pop();
        }
    }
}
