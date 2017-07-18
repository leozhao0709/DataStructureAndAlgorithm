package graph.matrix.undirected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by lzhao on 7/16/17.
 */

class Graph {

    private Vertex[] vertexList;
    private int[][] edgeMatrix;
    private int maxSize;
    private int nVertex;
    private boolean[] vertexVisited;

    Graph(int maxSize) {
        this.maxSize = maxSize;
        
        this.vertexList = new Vertex[maxSize];
        this.edgeMatrix = new int[maxSize][maxSize];
        this.vertexVisited = new boolean[maxSize];

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

        stackloop:
        while (!stack.empty()) {
            Vertex v = stack.pop();

            int vIndex = -1;
            for (int i = 0; i < nVertex; i++) {
                if (vertexList[i] == v) {
                    if (!vertexVisited[i]) {
                        System.out.println(v);
                        this.vertexVisited[i] = true;
                        vIndex = i;
                        break;
                    } else {
                        continue stackloop;
                    }
                }
            }


            // already visited
//            if (vIndex != -1) {
                for (int i = 0; i < nVertex; i++) {
                    if (this.edgeMatrix[vIndex][i] != 0 && this.edgeMatrix[vIndex][i] != Integer.MAX_VALUE && !this.vertexVisited[i]) {
                        stack.push(this.vertexList[i]);
                    }
                }
//            }
        }

        for (int i = 0; i < nVertex; i++) {
            this.vertexVisited[i] = false;
        }


    }

    void BFS() {
        Queue<Vertex> queue = new LinkedList<Vertex>();
        queue.offer(this.vertexList[0]);

        stackloop:
        while (!queue.isEmpty()) {
            Vertex v = queue.poll();

            int vIndex = -1;
            for (int i = 0; i < nVertex; i++) {
                if (this.vertexList[i] == v) {
                    if (!this.vertexVisited[i]) {
                        this.vertexVisited[i] = true;
                        System.out.println(v);
                        vIndex = i;
                        break;
                    } else {
                        // already visited this vertex, then don't consider this one again
                        continue stackloop;
                    }
                }
            }

            for (int i = 0; i < nVertex; i++) {
                if (this.edgeMatrix[vIndex][i] != 0 && this.edgeMatrix[vIndex][i] != Integer.MAX_VALUE && !this.vertexVisited[i]) {
                    queue.offer(this.vertexList[i]);
                }
            }

        }
    }
}
