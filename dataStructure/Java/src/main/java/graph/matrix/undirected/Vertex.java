package graph.matrix.undirected;

/**
 * Created by lzhao on 7/16/17.
 */

class Vertex {
    private String label;

    Vertex(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }
}
