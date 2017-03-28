package buzz.coding.sda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Graph {
    private List<Vertex> vertexes;

    public Graph(int v) {
        vertexes = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            vertexes.add(new Vertex(i));
        }
    }

    public void addEdge(int from, int to) {
        Edge e = new Edge(vertexes.get(from), vertexes.get(to));
        vertexes.get(from).addEdge(e);
    }

    public void dfs(int from) {
        if (!vertexes.get(from).isVisited()) {
            System.out.println("DFS: " + from);
            vertexes.get(from).setVisited(true);
            for (Edge e : vertexes.get(from).getEdges()) {
                dfs(e.getTarget().getId());
            }
        }
    }


    public void dfsWithStack(int from) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(vertexes.get(from));
        while (!stack.empty()) {
            Vertex v = stack.pop();
            if (!v.isVisited()) {
                System.out.println("DFS: " + v.getId());
                v.setVisited(true);
                for (Edge e : v.getEdges()) {
                    stack.push(e.getTarget());
                }
            }
        }
    }


    public void bfs(int from) {
        LinkedList<Vertex> queue = new LinkedList<>();
        queue.add(vertexes.get(from));
        while (!queue.isEmpty()) {
            Vertex v = queue.pop();
            if (!v.isVisited()) {
                System.out.println("BFS: " + v.getId());
                v.setVisited(true);
                for (Edge e : v.getEdges()) {
                    queue.add(e.getTarget());
                }
            }
        }
    }
}
