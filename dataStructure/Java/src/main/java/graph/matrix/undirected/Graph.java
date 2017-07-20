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
    private Vertex[] shortestPath;

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

    public Vertex[] getShortestPath() {
        return shortestPath;
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

        stackLoop:
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
                        continue stackLoop;
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

        queueLoop:
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
                        continue queueLoop;
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

    /**
     * 普里姆算法. 每一步都取最短, 从而得到最短路径
     *
     * @return 最短路径
     */
    int primAlgorithm() {

        int shortestValue = 0;
        int[] shortestPathTemp = new int[nVertex];
        this.shortestPath = new Vertex[nVertex];

        for (int i = 0; i < nVertex; i++) {
            shortestPathTemp[i] = this.edgeMatrix[0][i];
            this.shortestPath[0] = this.vertexList[0];
        }

        int nShortestPathVertex = 1;
        for (int i = 1; i < nVertex; i++) {

            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 1; j < nVertex; j++) {
                if (shortestPathTemp[j] != 0 && shortestPathTemp[j] != Integer.MAX_VALUE) {
                    if (shortestPathTemp[j] < min) {
                        min = shortestPathTemp[j];
                        minIndex = j;
                    }
                }
            }

            shortestValue += min;
            shortestPathTemp[minIndex] = 0; // 0 means this vertex already in the shortest path, so do not retrive
            this.shortestPath[nShortestPathVertex++] = this.vertexList[minIndex];

            // after get the next value, we should update the shortestPathTemp to get the most recently shortestPathTemp
            for (int j = 1; j < nVertex; j++) {
                if (shortestPathTemp[j] != 0 && this.edgeMatrix[minIndex][j] < shortestPathTemp[j] ) {
                    shortestPathTemp[j] = this.edgeMatrix[minIndex][j];
                }
            }
        }



        return shortestValue;
    }
}
