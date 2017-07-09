package tree.binary;

/**
 * Created by lzhao on 7/8/17.
 */

class Node<T> {

    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;
    private boolean visited;

    Node(T data) {
        this.data = data;
        this.visited = false;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }


    public Node<T> getRightChild() {
        return rightChild;
    }

    void setRightChild(Node<T> data) {
        this.rightChild = data;
    }

    void setLeftChild(Node<T> data) {
        this.leftChild = data;
    }
}
