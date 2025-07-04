package Stack;

import java.util.ArrayList;
import java.util.*;


public class Stack1 {
    // 1.stsck using arraylist


    // static ArrayList<Integer> list=new ArrayList<>();
    // public static boolean isEmpty() {
    //     return list.size()==0;
        
    // }
    // //push
    // public static void push(int data){
    //     list.add(data);
    // }
    // //pop
    // public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     int top=list.get(list.size()-1);
    //     list.remove(list.size()-1);
    //     return top;
    // }
    // //peek
    // public static int peek(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     return list.get(list.size()-1);
    // }

    


    //2.stack using LL

    // // Node class for the stack
    // static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // // Stack implementation using Linked List
    // static class Stack {
    //     Node head = null;

    //     public boolean isEmpty() {
    //         return head == null;
    //     }

    //     // push method
    //     public void push(int data) {
    //         Node newNode = new Node(data);
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     // pop method
    //     public int pop() {
    //         if (isEmpty()) {
    //             System.out.println("Stack is empty");
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     // peek method
    //     public int peek() {
    //         if (isEmpty()) {
    //             System.out.println("Stack is empty");
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }

    // public static void main(String[] args) {
    //     Stack s = new Stack();

    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);

    //     while (!s.isEmpty()) {
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }




    // //3.Push bottom of stack
    // public static void pushAtBottom(Stack<Integer>s,int data){
    //     if(s.isEmpty()){
    //         s.push(data);
    //         return;
    //     }
    //     int top=s.pop();
    //      pushAtBottom(s, data);
    //      s.push(top);
    // }


    // //3.Reverse a String in stack

    // public static String reverseString(String str){
    //     Stack<Character> s= new Stack<>();
    //     int idx=0;
    //     while (idx < str.length()) {
    //         s.push(str.charAt(idx));
    //         idx++;
            
    //     }
    //     StringBuilder result= new StringBuilder("");
    //     while (!s.isEmpty()) {
    //         char curr=s.pop();
    //         result.append(curr);
            
    //     }
    //     return result.toString();
    // }

    // public static void reverseStack(Stack<Integer> s){
    //     if(s.isEmpty()){
    //         return ;
    //     }
    //     int top=s.pop();
    //     reverseStack(s);
    //     pushAtBottom(s, top);
    // }

    // public static void printStack(Stack<Integer> s){
    //     while (!s.isEmpty()) {
    //         System.out.println(s.pop());
            
    //     }
    // }
    // public static void main(String[] args) {
    //     // Stack<Integer> s= new Stack<>();
    //     // s.push(1);
    //     // s.push(2);
    //     // s.push(3);

    //     // pushAtBottom(s,4);
    //     //      while (!s.isEmpty()) {
    //     //     System.out.println(s.pop());       
    //     // }

    //     String str="abc";
    //     String result=reverseString(str);
    //     System.out.println(result);


    //     Stack<Integer> s= new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);

        
    //     reverseStack(s);
    //     printStack(s);
    // }
    

    // 4. Stock Span Problem
//     public static void stockspan(int stock[],int span[]){
//         Stack<Integer> s=new Stack<>();
//         span[0]=1;
//         s.push(0);

//         for(int i=1;i<stock.length;i++){
//             int currprice=stock[i];

//             while (!s.empty() && currprice > stock[s.peek()]) {
//                 s.pop();  
//             }
//             if(s.isEmpty()){
//                 span[i]=i+1;
//             }else{
//                 int prevHigh=s.peek();
//                 span[i]=i-prevHigh;

//             }
//             s.push(i);
//         }
//     }
//         public static void main(String[] args) {
//         int stock[]={100,80,60,70,60,85,100};
//         int span[]=new int[stock.length];
//         stockspan(stock,span);

//         for(int i=0;i<span.length;i++){
//             System.out.print(span[i]+" ");
//         }
//     }





//5.Next Greater Problem 
public static void main(String[] args) {
    int arr[]={6,8,0,1,3};
    Stack<Integer> s= new Stack<>();
    int nextGreater[]=new int[arr.length];

    for(int i=arr.length-1; i>=0;i--){
        while (!s.empty() && arr[s.peek()] <= arr[i]) {
            s.pop();
        }
        if(s.isEmpty()){
            nextGreater[i]=-1;
        }else{
            nextGreater[i]=arr[s.peek()];
        }
        s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }

 }



    

