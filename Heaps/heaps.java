package Heaps;
import java.util.*;

import Heaps.heaps.Student;



public class heaps {
    static class Student implements Comparable<Student> { //method Overrides  properties of Comparable  
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;  // Min-heap based on rank
        }
    }

    //insertion  in a Heap
    static class Heap {
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            //add at last idx of array
            arr.add(data);
            int x=arr.size()-1; //x is child
            int par=(x-1)/2; //par idx

            while (arr.get(x)< arr.get(par)) {
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par=(x-1)/2;
                
            }
        }
         public int peek() {
          return arr.get(0);
        }

        // Delete Node in Heap using heapify
        // private void heapify(int i){
        //     int left=2*i+1;
        //     int right=2*i+2;
        //     int minIdx=i;
        // if (left < arr.size() && arr.get(minIdx)> arr.get(left)) {
        //     minIdx=left;  
        // }
        //  if (right < arr.size() && arr.get(minIdx)> arr.get(right)) {
        //     minIdx=right;   
        // }
        // if (minIdx !=i) {
        //     int tenp=arr.get(i);
        //     arr.set(i, arr.get(minIdx));
        //     arr.set(minIdx, tenp);
        //     heapify(minIdx);
            
        // }

     //   }
        // public int remove(){
        //     int data=arr.get(0);
        //     //swap 1st and last
        //     int temp=arr.get(0);
        //     arr.set(0, arr.get(arr.size()-1));
        //     arr.set(arr.size()-1, temp);

        //     //delete last
        //     arr.remove(arr.size()-1);

        //     //heapify
        //     heapify(0);
        //     return data;
        // }
        // public boolean isEmpty(){
        //     return arr.size()==0;
        // }
 
    }


    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Heapify the affected subtree
            heapify(arr, maxIdx, size);
        }
    }

    // Heap Sort function

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Swap current root with end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }


    //nearest distance of k points from origin
    static class point implements Comparable<point>{
        int x;
        int y;
        int distseq;
        int idx;

        public point(int x,int y,int distseq,int idx){
            this.x=x;
            this.y=y;
            this.distseq=distseq;
            this.idx=idx;
        }
        @Override
        public int compareTo(point p2){
            return this.distseq-p2.distseq;
        }

    }



    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(new Student("a", 3));
        // pq.add(new Student("b", 4));
        // pq.add(new Student("z", 1));
        // pq.add(new Student("c", 2));
        // pq.add(new Student("d", 7));

        // while (!pq.isEmpty()) {
        //     Student top = pq.peek();
        //     System.out.println(top.name + " " + top.rank);
        //     pq.remove();  // O(log n)
        // }


        // Heap h= new Heap();
        // h.add(3);
        // h.add(4);
        // h.add(1);
        // h.add(5);

        // while (!h.isEmpty()) {
        //     System.out.println(h.peek());
        //     h.remove();
            
        // }


        int[] arr = {20, 5, 15, 22, 9, 3, 7};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        heapSort(arr);

        System.out.println("\nAfter sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        // k nearest distance of cars
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<point> pq=new PriorityQueue<>();
        for (int i = 0; i< pts.length; i++) {
            int distseq=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
           pq.add(new point(pts[i][0],pts[i][1],distseq,i))  ;         
        }
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }


        // cost of connecting n ropes
        int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq1.add(ropes[i]);
        }
        int cost=0;
        while (pq1.size()>1) {
            int min=pq1.remove();
            int min2=pq1.remove();
            cost += min+ min2;
            pq1.add(min+min2);
            
        }
        System.out.println("cost of connecting n ropes"+cost);

    
    }
}

    

