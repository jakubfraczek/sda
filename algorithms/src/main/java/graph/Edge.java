package graph;

public class Edge {
    private int value;
    private Vertex from;
    private Vertex to;

    public Edge(Vertex from, Vertex to) {
        System.out.println("Tworzę krawędź: " + from.getId() + " ---> " + to.getId());
        this.from = from;
        this.to = to;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Vertex getFrom() {
        return from;
    }

    public Vertex getTo() {
        return to;
    }

}
