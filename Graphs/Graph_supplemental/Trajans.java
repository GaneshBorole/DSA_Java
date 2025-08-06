package Graphs.Graph_supplemental;
import java.util.*;

public class Trajans {
    static class Edge {
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));
    }

   public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, boolean[] vis, int[] time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time[0]; // increment and assign global time

        for (int i=0;i<graph[curr].size();i++) {
            Edge e= graph[curr].get(i);
            int neigh = e.dest;

            if (neigh == par) {
                continue; // don't go back to parent
            }

            if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, vis, time);

                // After visiting child, update low[curr]
                low[curr] = Math.min(low[curr], low[neigh]);

                // Check for bridge
                if (low[neigh] > dt[curr]) {
                    System.out.println("Bridge: " + curr + " --- " + neigh);
                }
            } else {
                // back edge
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void TarjanBridge(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V];         // discovery time
        int[] low = new int[V];        // lowest discovery time reachable
        boolean[] vis = new boolean[V];
        int[] time = new int[1];       // global time counter (wrapped in array)

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }
    public static void main(String[] args) {
        int V=6;
        @SuppressWarnings("unchecked")
       ArrayList<Edge> graph[]=new ArrayList[V];
       createGraph(graph);
       TarjanBridge(graph, V);
        
    }
    
}
