import java.util.*;

public class Create_A_Graph{

    static class Edge {
        int src, dest, weight;
        Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        int n = graph.length;
        for(int i = 0; i < n; i++)  graph[i] = new ArrayList<Edge>();

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    static void printNeighbour(ArrayList<Edge> graph[], int n){
        for(int i = 0; i < graph[n].size(); i++){
            Edge e = graph[n].get(i);
            System.out.println(e.dest + " " + e.weight);
        }
    }

    public static void main(String args[]){
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        printNeighbour(graph, 2);        
    }
}