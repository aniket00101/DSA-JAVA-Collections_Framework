import java.util.*;
class AllPathFromSourceToVertex {
    
    static class Edge {
        int src, dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++)   graph[i] = new ArrayList<Edge>();
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5)); 
    }

    static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, int target, String path) {
        if(curr == target) {
            System.out.println(path);
            return;
        }
        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false) {
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, target, path + e.dest);
                vis[curr] = false;
            }
        }
    }

    public static void main(String args[]) {
        int vertex = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        boolean vis[] = new boolean[vertex];
        int source = 0, target = 5;
        printAllPath(graph, vis, source, target, "0");
    }
}
