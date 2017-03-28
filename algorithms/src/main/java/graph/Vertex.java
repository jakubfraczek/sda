package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int id;
    private List<Edge> edges;


    public Vertex(int id) {
        System.out.println("Tworzę nowy wierzchołek o id: " + id);
        this.id = id;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        System.out.println("Wierzchołek id: " + id);
        System.out.println("        Dodaję krawędź: " + edge.getFrom().getId() + " ---> " + edge.getTo().getId());
        edges.add(edge);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
