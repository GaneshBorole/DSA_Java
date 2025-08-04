package Graphs.Graph_5;

import java.util.*;

import Graphs.Graph_5.part5.Edge;

public class part5 {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void CreateGraph(int[][] flights, ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt= flights[i][2];

            Edge e= new Edge(src, dest, wt);
            graph[src].add(e);

        }
    }

    // 1. Cheapest Flights within k stops
    static class Info {
        int v, cost, stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int CheapestFlight(int n, int[][] flights, int src, int dest, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[n];
        CreateGraph(flights, graph);

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

          while (!q.isEmpty()) {
            Info curr=q.remove();
            if (curr.stops > k) {
                break;    
            }
            for(int i=0;i<graph[curr.v].size();i++){
              Edge e= graph[curr.v].get(i);
              int u= e.src;
              int v= e.dest;
              int wt= e.wt;

                if (curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }
        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {
            {0, 1, 100},
            {1, 2, 100},
            {2, 0, 100},
            {1, 3, 600},
            {2, 3, 200}
        };
        int src = 0, dest = 3, k = 1;

        int result = CheapestFlight(n, flights, src, dest, k);
        System.out.println("Cheapest Price = " + result);
    }
}
