package buzz.coding.sda;


public class Edge {
    private Vertex source;
    private Vertex target;

    public Edge(Vertex source, Vertex target) {
        System.out.println(String.format("Tworze krawedz (%d) ---> (%d)", source.getId(), target.getId()));
        this.source = source;
        this.target = target;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getTarget() {
        return target;
    }
}
