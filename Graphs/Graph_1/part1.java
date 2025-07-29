package Graphs.Graph_1;

import java.util.*;

import Graphs.Graph_1.part1.Edge;

public class part1 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 3, 1));

        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }

    // BFS algorithm
    public static void BFS(ArrayList<Edge>[] graph) { //O(n)
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);

                }

            }

        }
    }

    public static void main(String[] args) {
        // int V=5;
        // @SuppressWarnings("unchecked")
        // ArrayList<Edge>[] graph=new ArrayList[V];
        // for(int i=0;i<V;i++){
        // graph[i]= new ArrayList<>();
        // }
        // //vertex 0
        // graph[0].add(new Edge(0, 1, 5));
        // //vertex 1
        // graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1,2, 1));
        // graph[1].add(new Edge(1,3, 3));

        // //vertex 2
        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2,3,1));
        // graph[2].add(new Edge(2, 4, 2));

        // //vertex 3
        // graph[3].add(new Edge(3, 1, 3));
        // graph[3].add(new Edge(3, 2, 1));
        // // vertex 4
        // graph[4].add(new Edge(4, 2, 3));

        // //2's neighbors
        // for(int i=0;i<graph[2].size();i++){
        // Edge e=graph[2].get(i);
        // System.out.println(e.dest);
        // }

        // BFS algorithm
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        createGraph(graph);
        BFS(graph);

    }

}
