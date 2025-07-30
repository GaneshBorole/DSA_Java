package Graphs.Graph_2;
import java.util.*;

import Graphs.Graph_2.part2.Edge;


public class part2 {
    static class Edge {
        int src;
        int dest;
      

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
           
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
      

        graph[4].add(new Edge(4, 3));
        
    }

    //1. detect a cycle in graph
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                };
                
            }
        }
        return false;
    }
  public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        if (!vis[e.dest]) {
            if (detectCycleUtil(graph, vis, e.dest, curr)) {
                return true;
            }
        } else if (e.dest != par) {
            // A visited node that is not the parent means a cycle
            return true;
        }
    }
    return false;
}



// 1.check if  given graph is Bipartite or Not
public static boolean isBipartite(ArrayList<Edge> [] graph){
    int color []=new int[graph.length];
    for (int i = 0; i < color.length; i++) {
        color[i]=-1;  
    }
    Queue<Integer> q= new LinkedList<>();
    for (int i = 0; i < graph.length; i++) {
        if (color[i]== -1) {
            q.add(i);
            color[i]=0;//yellow
            while (!q.isEmpty()) {
                int curr=q.remove();
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge e= graph[curr].get(j);
                    if (color[e.dest]== -1) {
                        int nextCol=color[curr] ==0 ? 1:0;
                        color[e.dest]=nextCol;
                        q.add(e.dest);
                    }else if (color[e.dest]==color[curr]) {
                        return false;
                        
                    }
                    
                }
                
            }
            
        }
        
    }
    return true;
}
     public static void main(String[] args) {
        int V=5;
        @SuppressWarnings ("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
       // System.out.println(detectCycle(graph));
       System.out.println(isBipartite(graph));
    }

    
}

    

