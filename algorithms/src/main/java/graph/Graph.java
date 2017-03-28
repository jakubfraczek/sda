package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertexes;

    public Graph(int numOfVertexes) {
        vertexes = new ArrayList<>();
        for (int i = 0; i < numOfVertexes; i++) {
            vertexes.add(new Vertex(i));
        }
    }

    public void addVertex(int vertex) {
        vertexes.add(new Vertex(vertex));
    }

    public void addEdge(int from, int to) {
        vertexes.get(from).addEdge(new Edge(vertexes.get(from), vertexes.get(to)));
    }
}
