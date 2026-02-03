import java.util.*;

public class BFS_GraphTravesal_DisconnectedComponent {
    static class Edge {
        int src, dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        int n = graph.length;
        for(int i = 0; i < n; i++)  graph[i] = new ArrayList<Edge>();

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    static void bfs(ArrayList<Edge> graph[], int v, boolean visited[], int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(visited[curr] == false){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]){
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);     
        boolean visited[] = new boolean[vertex];
        for(int i=0; i<vertex; i++){
            if(visited[i] == false) 
                bfs(graph, vertex, visited, i); 
        }  
    }
}
