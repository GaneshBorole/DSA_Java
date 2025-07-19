package Heaps;
import java.util.*;

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
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
        if (left < arr.size() && arr.get(minIdx)> arr.get(left)) {
            minIdx=left;  
        }
         if (right < arr.size() && arr.get(minIdx)> arr.get(right)) {
            minIdx=right;   
        }
        if (minIdx !=i) {
            int tenp=arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, tenp);
            heapify(minIdx);
            
        }

        }
        public int remove(){
            int data=arr.get(0);
            //swap 1st and last
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //delete last
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
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


        Heap h= new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
            
        }
    }
}
