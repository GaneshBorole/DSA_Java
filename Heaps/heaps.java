package Heaps;

import java.util.*;

public class heaps {
    static class Student implements Comparable<Student> {
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

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("a", 3));
        pq.add(new Student("b", 4));
        pq.add(new Student("z", 1));
        pq.add(new Student("c", 2));
        pq.add(new Student("d", 7));

        while (!pq.isEmpty()) {
            Student top = pq.peek();
            System.out.println(top.name + " " + top.rank);
            pq.remove();  // O(log n)
        }
    }
}
