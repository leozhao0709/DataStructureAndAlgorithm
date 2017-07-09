package tree.binary;
import java.util.Stack;

/**
 * Created by lzhao on 7/8/17.
 */

class BinaryTree<T> {

    private Node<T> root;

    private BinaryTree(Node<T> root) {
        this.root = root;
    }

    Node<T> getRoot() {
        return root;
    }

    void setRoot(Node<T> root) {
        this.root = root;
    }

    static BinaryTree<String> createTree(Node<String> root) {

        BinaryTree<String> tree = new BinaryTree<String>(root);

        Node<String> B = new Node<String>("B");
        Node<String> C = new Node<String>("C");
        Node<String> D = new Node<String>("D");
        Node<String> E = new Node<String>("E");
        Node<String> F = new Node<String>("F");
        Node<String> G = new Node<String>("G");
        Node<String> H = new Node<String>("H");

        root.setLeftChild(B);
        root.setRightChild(C);
        B.setLeftChild(D);
        B.setRightChild(E);
        C.setRightChild(F);
        F.setLeftChild(G);
        F.setRightChild(H);

        return tree;
    }

    void preOrderTraverse(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preOrderTraverse(node.getLeftChild());
        preOrderTraverse(node.getRightChild());
    }

    void inOrderTraverse(Node<T> node) {
        if (node == null) {
            return;
        }

        inOrderTraverse(node.getLeftChild());
        System.out.println(node.getData());
        inOrderTraverse(node.getRightChild());
    }

    void postOrderTraverse(Node<T> node) {
        if (node == null) {
            return;
        }

        postOrderTraverse(node.getLeftChild());
        postOrderTraverse(node.getRightChild());
        System.out.println(node.getData());
    }

    void preOrderTraverseNonRec(Node<T> node) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node<T> currentNode = stack.pop();
            System.out.println(currentNode.getData());
            if (currentNode.getRightChild() != null) {
                stack.push(currentNode.getRightChild());
            }

            if (currentNode.getLeftChild() != null) {
                stack.push(currentNode.getLeftChild());
            }
        }
    }

    void inOrderTraverseNonRec(Node<T> node) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        stack.push(node);

//        while (!stack.isEmpty()) {
//            Node<T> currentPeekingNode = stack.peek();
//            if (currentPeekingNode.getLeftChild() != null && !currentPeekingNode.getLeftChild().isVisited()) {
//                stack.push(currentPeekingNode.getLeftChild());
//            } else {
//                Node<T> popNode = stack.pop();
//                System.out.println(popNode.getData());
//                popNode.setVisited(true);
//                if (popNode.getRightChild() != null) {
//                    stack.push(popNode.getRightChild());
//                }
//            }
//        }

        boolean isNewNode = true;
        while (!stack.empty()) {
            Node<T> currentPeekingNode = stack.peek();
            if (currentPeekingNode.getLeftChild() != null && isNewNode) {
                stack.push(currentPeekingNode.getLeftChild());
                isNewNode = true;
            } else {
                Node<T> popNode = stack.pop();
                System.out.println(popNode.getData());
                if (popNode.getRightChild() != null) {
                    stack.push(popNode.getRightChild());
                    isNewNode = true;
                } else {
                    isNewNode = false;
                }
            }
        }
    }

    void postOrderTraverseNonRec(Node<T> node) {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        stack.push(node);

        while (!stack.empty()) {
            Node<T> currentPeekingNode = stack.peek();

            if (currentPeekingNode.getLeftChild() != null && !currentPeekingNode.getLeftChild().isVisited()) {
                stack.push(currentPeekingNode.getLeftChild());
            } else if (currentPeekingNode.getRightChild() != null && !currentPeekingNode.getRightChild().isVisited()) {
                stack.push(currentPeekingNode.getRightChild());
            } else {
                stack.pop();
                System.out.println(currentPeekingNode.getData());
                currentPeekingNode.setVisited(true);
            }
        }

//        boolean leftTreeFinishTraverse = false;
//        boolean rightTreeFinishTraverse = false;
//
//        while (!stack.empty()) {
//            Node<T> currentPeekingNode = stack.peek();
//
//            if (currentPeekingNode.getLeftChild() != null && !leftTreeFinishTraverse) {
//                stack.push(currentPeekingNode.getLeftChild());
//                leftTreeFinishTraverse = false;
//            } else if (currentPeekingNode.getRightChild() != null && !rightTreeFinishTraverse) {
//                stack.push(currentPeekingNode.getRightChild());
//                rightTreeFinishTraverse = false;
//            } else {
//                stack.pop();
//                System.out.println(currentPeekingNode.getData());
//                if (!leftTreeFinishTraverse) {
//                    leftTreeFinishTraverse = true;
//                } else if(!rightTreeFinishTraverse) {
//                     rightTreeFinishTraverse = true;
//                } else {
//
//                }
//            }
//
//
//        }
    }

}
