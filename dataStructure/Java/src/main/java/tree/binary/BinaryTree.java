package tree.binary;
import java.util.Stack;

/**
 * Created by lzhao on 7/8/17.
 */

class BinaryTree<T extends Comparable<T>> {

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
        Node<String> I = new Node<String>("I");
        Node<String> J = new Node<String>("J");
        Node<String> K = new Node<String>("K");

        root.setLeftChild(B);
        root.setRightChild(C);
        B.setLeftChild(D);
        B.setRightChild(E);
        C.setRightChild(F);
        F.setLeftChild(G);
        F.setRightChild(H);
        E.setRightChild(I);
        I.setLeftChild(J);
        I.setRightChild(K);

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

        if (node == null) {
            return;
        }

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

        if (node == null) {
            return;
        }

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

//        boolean isNewNode = true;
//        while (!stack.empty()) {
//            Node<T> currentPeekingNode = stack.peek();
//            if (currentPeekingNode.getLeftChild() != null && isNewNode) {
//                stack.push(currentPeekingNode.getLeftChild());
//                isNewNode = true;
//            } else {
//                Node<T> popNode = stack.pop();
//                System.out.println(popNode.getData());
//                if (popNode.getRightChild() != null) {
//                    stack.push(popNode.getRightChild());
//                    isNewNode = true;
//                } else {
//                    isNewNode = false;
//                }
//            }
//        }

        while (!stack.empty()) {
            Node<T> currentNode = stack.peek();
            // push all left child into stack
            while (currentNode.getLeftChild() != null) {
                stack.push(currentNode.getLeftChild());
                currentNode = stack.peek();
            }

            // first print left most child
            currentNode = stack.pop();
            System.out.println(currentNode.getData());
            // left child most has right child, then push right child
            if (currentNode.getRightChild() != null) {
                stack.push(currentNode.getRightChild());
            } else {
                // if left child doesn't have right child and has its parent in stack, then print and to see if parent has right child
                if (!stack.empty()) {
                    currentNode = stack.pop();
                    System.out.println(currentNode.getData());
                    if (currentNode.getRightChild() != null) {
                        stack.push(currentNode.getRightChild());
                    }
                }
            }
        }
    }

    void postOrderTraverseNonRec(Node<T> node) {

        if (node == null) {
            return;
        }

        Stack<Node<T>> stack = new Stack<Node<T>>();
        stack.push(node);

        /*
            use the node visited parameters, like traverse graph
         */
//        while (!stack.empty()) {
//            Node<T> currentPeekingNode = stack.peek();
//
//            if (currentPeekingNode.getLeftChild() != null && !currentPeekingNode.getLeftChild().isVisited()) {
//                stack.push(currentPeekingNode.getLeftChild());
//            } else if (currentPeekingNode.getRightChild() != null && !currentPeekingNode.getRightChild().isVisited()) {
//                stack.push(currentPeekingNode.getRightChild());
//            } else {
//                stack.pop();
//                System.out.println(currentPeekingNode.getData());
//                currentPeekingNode.setVisited(true);
//            }
//        }


        /*
            None visited parameters
         */

        Node<T> currentNode;
        Node<T> lastVisitedNode = null;

        while (!stack.empty()) {
            currentNode = stack.peek();
            // if last visited right child, then just print current Node. If last visited left child, then start traverse
            // right child. If none left nor right child is last visited, then it must be traverse some right child, because
            // if we first traverse or left child.
            if (lastVisitedNode == currentNode.getRightChild()) {
                System.out.println(currentNode.getData());
                lastVisitedNode = stack.pop();
            } else if (lastVisitedNode == currentNode.getLeftChild()) {
                if (currentNode.getRightChild() != null) {
                    stack.push(currentNode.getRightChild());
                } else {
                    System.out.println(currentNode.getData());
                    lastVisitedNode = stack.pop();
                }
            } else {
                while (currentNode.getLeftChild() != null) {
                    stack.push(currentNode.getLeftChild());
                    currentNode = currentNode.getLeftChild();
                }

                currentNode = stack.peek();
                if (currentNode.getRightChild() != null) {
                    stack.push(currentNode.getRightChild());
                } else {
                    System.out.println(currentNode.getData());
                    lastVisitedNode = stack.pop();
                }
            }

        }

    }

}
