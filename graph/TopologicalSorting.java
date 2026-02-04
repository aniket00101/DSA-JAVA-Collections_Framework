import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    
    static class Edge {
        int src, dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<Edge>();
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    static void toposorting(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> st) {
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])    toposorting(graph, vis, e.dest, st);
        }
        st.push(curr);
    }

    static void topsort(ArrayList<Edge> graph[], int v){
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[v];
        for(int i=0; i<v; i++) {
            if(!vis[i])     toposorting(graph, vis, i, st);
        }
        while(!st.isEmpty())    System.out.print(st.pop() + " ");
    }
    
    public static void main(String args[]) {
        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        topsort(graph, vertex);
    }
}
 