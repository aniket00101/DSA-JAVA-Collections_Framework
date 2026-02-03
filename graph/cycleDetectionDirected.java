import java.util.ArrayList;

class cycleDetectionDirected {
    
    static class Edge {
        int src, dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++)   graph[i] = new ArrayList<Edge>();
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
         graph[3].add(new Edge(3, 0));
    }

    static boolean isCycleDetected(ArrayList<Edge> graph[], boolean vis[], boolean rec[], int curr) {
        vis[curr] = true;
        rec[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(rec[e.dest])   return true;
            else if(vis[e.dest] == false && isCycleDetected(graph, vis, rec, e.dest))   return true;
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String args[]) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        boolean vis[] = new boolean[vertex];
        boolean rec[] = new boolean[vertex];
        System.out.println(isCycleDetected(graph, vis, rec, 0));
    }
}
