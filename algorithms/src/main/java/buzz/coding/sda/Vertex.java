package buzz.coding.sda;

import java.util.ArrayList;
import java.util.List;


public class Vertex {
    private int id;
    List<Edge> edges;

    boolean visited = false;

    public Vertex(int id) {
        System.out.println("Tworze wierzcholek o id = " + id);
        this.id = id;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge e) {
        System.out.println("Wierzcholek " + id + ":");
        System.out.println(String.format("    dodaje krawedz (%d) ---> (%d)",
                e.getSource().getId(), e.getTarget().getId()));
        edges.add(e);
    }

    public int getId() {
        return id;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
