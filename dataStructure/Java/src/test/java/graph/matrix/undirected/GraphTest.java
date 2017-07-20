package graph.matrix.undirected;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 7/17/17.
 */
public class GraphTest {

    Graph graph;

    /**
     *
     * @throws Exception
     *
     *      v0  v1  v2  v3  v4  v5  v6  v7
     *   v0  0   5   x   x   7   x   8   x
     *   v1  5   0   x   5   x   x   x   x
     *   v2  x   x   0   x   x   1   4   1
     *   v3  x   5   x   0   3   x   x   x
     *   v4  7   x   x   3   0   x   x   x
     *   v5  x   x   1   x   x   0   x   x
     *   v6  8   x   4   x   x   x   0   x
     *   v7  x   x   1   x   x   x   x   0
     */
    @Before
    public void setUp() throws Exception {
        this.graph = new Graph(20);

        this.graph.addVertex("v0");
        this.graph.addVertex("v1");
        this.graph.addVertex("v2");
        this.graph.addVertex("v3");
        this.graph.addVertex("v4");
        this.graph.addVertex("v5");
        this.graph.addVertex("v6");
        this.graph.addVertex("v7");

        this.graph.addEdge(0, 1, 5);
        this.graph.addEdge(0, 4, 7);
        this.graph.addEdge(0, 6, 8);
        this.graph.addEdge(1, 3, 5);
        this.graph.addEdge(2, 5, 1);
        this.graph.addEdge(2, 6, 4);
        this.graph.addEdge(2, 7, 1);
        this.graph.addEdge(3, 4, 3);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getEdgeSize() throws Exception {
        assertEquals(8, this.graph.getEdgeSize());
    }

    @Test
    public void DFS() throws Exception {
        this.graph.DFS();
    }

    @Test
    public void BFS() throws Exception {
        this.graph.BFS();
    }

    @Test
    public void primAlgorithm() throws Exception {
        System.out.println("shortest path value is: " + this.graph.primAlgorithm());
        System.out.println("shortest path is: ");
        for (int i = 0; i < this.graph.getShortestPath().length; i++) {
            if (i != this.graph.getShortestPath().length - 1) {
                System.out.print(this.graph.getShortestPath()[i] + " -> ");
            } else {
                System.out.println(this.graph.getShortestPath()[i]);
            }
        }
    }
}