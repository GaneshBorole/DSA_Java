package Heaps;

import java.util.*;

import Heaps.heaps.Heap;
import Heaps.heaps.Student;

public class heaps {
    static class Student implements Comparable<Student> { //method Overrides    
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
            //add at last idx
            arr.add(data);
            int x=arr.size()-1; //x is child
            int par=(x-1)/2; //par idx

            while (arr.get(x)< arr.get(par)) {
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
            }
        }
         public void print() {
            System.out.println("Heap array: " + arr);
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

         Heap h = new Heap();
        h.add(5);
        h.add(3);
        h.add(2);
        h.add(4);
        h.add(1);
        h.print();
    }
}
