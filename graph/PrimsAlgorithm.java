import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    
    static class Edge {
        int src, dist, wt;
        Edge(int src, int dist, int wt) {
            this.src = src;
            this.dist = dist;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node, cost;
        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) 
            graph[i] = new ArrayList<Edge>();
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static void primsalgo(ArrayList<Edge> graph[], int V, int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[V];
        int totalcost = 0;
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.node]) {
                vis[curr.node] = true;
                totalcost += curr.cost;
                for(int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dist])    pq.add(new Pair(e.dist, e.wt));
                }
            }
        }
        System.out.print(totalcost);
    }

    public static void main(String args[]) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        primsalgo(graph, vertex, 0);
    }
}
