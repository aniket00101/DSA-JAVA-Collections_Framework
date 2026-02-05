import java.util.ArrayList;

public class BellmanFordAlgorithm {

    static class Edge {
        int src, dist, wt;
        Edge(int src, int dist, int wt) {
            this.src = src;
            this.dist = dist;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) 
            graph[i] = new ArrayList<Edge>();
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }

    static void bellmanFord(ArrayList<Edge> graph[], int V, int src) {
        int dist[] = new int[V];
        for(int i = 0; i < V; i++)
            if(i != src)    dist[i] = Integer.MAX_VALUE;
        for(int i = 0; i < V - 1; i++) {
            for(int j = 0; j < V; j++) {
                for(int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u = e.src, v = e.dist;
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v])
                        dist[v] = dist[u] + e.wt;
                }
            }
        }
        for(int num : dist)     System.out.print(num + " ");
    }

    public static void main(String args[]) {
        int vertex = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        bellmanFord(graph, vertex, 0);
    }
}
