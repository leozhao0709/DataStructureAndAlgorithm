package graph.matrix.undirected;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by lzhao on 7/16/17.
 */

class Graph {

    private Vertex[] vertexList;
    private int[][] edgeMatrix;
    private int maxSize;
    private int nVertex;

    Graph(int maxSize) {
        this.maxSize = maxSize;
        
        this.vertexList = new Vertex[maxSize];
        this.edgeMatrix = new int[maxSize][maxSize];

        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                // 权重无穷大, 相当于不连接
                this.edgeMatrix[i][j] = Integer.MAX_VALUE;

                if (i == j) {
                    // 定点自身和自身权重为0
                    this.edgeMatrix[i][j] = 0;
                }
            }
        }
        this.nVertex = 0;
    }

    void addVertex(String label) {
        this.vertexList[this.nVertex++] = new Vertex(label);
    }

    // 第i个顶点和第j个顶点相连接, 并且权重是value
    void addEdge(int i, int j, int value) {
        this.edgeMatrix[i][j] = value;
        this.edgeMatrix[j][i] = value;
    }

    int getEdgeSize() {
        int size = 0;
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                if (this.edgeMatrix[i][j] != 0 && this.edgeMatrix[i][j] != Integer.MAX_VALUE) {
                    size++;
                }
            }
        }
        return size/2;
    }

    void DFS() {
        Stack<Vertex> stack = new Stack<Vertex>();
        stack.push(this.vertexList[0]);

        while (!stack.empty()) {
            
        }
    }
}
