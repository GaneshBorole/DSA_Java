package Graphs.Graph_3;
import java.util.*;

public class part3 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;

        }   
    }
static void cerateGraph(ArrayList<Edge> [] graph){
    for (int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 1));

    graph[4].add(new Edge(4, 1));
    graph[4].add(new Edge(4, 0));

    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));


}
//Topological sort using BFS (kahns algorithm)
public static void calcuIndegree(ArrayList<Edge>graph [],int indegree[]){
    for(int i=0;i<graph.length;i++){
        int v=i;
        for(int j=0;j<graph[v].size();j++){
            Edge e= graph[v].get(j);
            indegree[e.dest]++;
        }
    }

}
public static void topsort(ArrayList<Edge> graph[]){
    int indegree[]=new int[graph.length];
    calcuIndegree(graph, indegree);
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<indegree.length;i++){
        if (indegree[i]==0) {
            q.add(i);
        }
    }
    //bfs
    while (!q.isEmpty()) {
        int curr=q.remove();
        System.out.print(curr+" ");

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            indegree[e.dest]--; 
            if (indegree[e.dest]==0) {
                q.add(e.dest);
            }
        }  
    }
    System.out.println();
}


// All paths from source to destination
public static void printAllpath(ArrayList<Edge> graph[],int src,int dest,String path){
    if (src== dest) {
        System.out.print(path+dest);
        return;
        
    }
    for(int i=0;i<graph[src].size();i++){
        Edge e=graph[src].get(i);
        printAllpath(graph, e.dest, dest, path+src);
    }
}
    public static void main(String[] args) {
        int V=6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[V];
        cerateGraph(graph);
       // topsort(graph);
       int src=5;int dest=1;
       printAllpath(graph, src, dest, " ");

        
    }
    
}
