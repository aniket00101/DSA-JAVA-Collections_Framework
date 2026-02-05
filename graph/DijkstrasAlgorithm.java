import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {

    static class Edge {
        int src, dist, wt;
        Edge(int src, int dist, int wt) {
            this.src = src;
            this.dist = dist;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node, dist;
        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<Edge>();

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static void dijkastra(ArrayList<Edge> graph[], int vertex, int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int distance[] = new int[vertex];
        boolean vis[] = new boolean[vertex];
        for(int i = 0; i < vertex; i++) 
            if(i != src)    distance[i] = Integer.MAX_VALUE;

        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.node]) {
                vis[curr.node] = true;
                for(int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dist;
                    if(distance[u] + e.wt < distance[v]){
                        distance[v] = distance[u] + e.wt;
                        pq.add(new Pair(v, distance[v]));
                    }    
                }
            }
        }
        for(int num : distance)   System.out.print(num + " ");
    }

    public static void main(String args[]) {
        int vertex = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        dijkastra(graph, vertex, 0);
    }
}
