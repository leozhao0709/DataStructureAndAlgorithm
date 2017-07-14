package tree.binary;

/**
 * Created by lzhao on 7/12/17.
 */

class BinarySearchTree<T extends Comparable<T>> {

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    private Node<T> root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node<T> root) {
        this.root = root;
    }

    static BinarySearchTree<Integer> createTree() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(new Node<Integer>(18));
        tree.root.setLeftChild(new Node<Integer>(9));
        tree.root.setRightChild(new Node<Integer>(20));

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

    void insertNode(Node<T> node) {
        if (node == null) {
            return;
        }

        if (this.root == null) {
            this.root = node;
        } else {
            Node<T> currentNode = this.root;
            while (true) {
                if (node.getData().compareTo(currentNode.getData()) < 0) {
                    if (currentNode.getLeftChild() == null) {
                        currentNode.setLeftChild(node);
                        return;
                    }
                    currentNode = currentNode.getLeftChild();
                } else if (node.getData().compareTo(currentNode.getData()) > 0) {
                    if (currentNode.getRightChild() == null) {
                        currentNode.setRightChild(node);
                        return;
                    }
                    currentNode = currentNode.getRightChild();
                } else {
                    return;
                }
            }
        }
    }

    boolean findNode(Node<T> node) {
        if (this.root != null) {
            Node<T> currentNode = this.root;
            while (currentNode != null) {
                if (node.getData().compareTo(currentNode.getData()) < 0) {
                    currentNode = currentNode.getLeftChild();
                } else if (node.getData().compareTo(currentNode.getData()) > 0) {
                    currentNode = currentNode.getRightChild();
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    Node<T>[] getSuccessor(Node node) {
        if (node == null || node.getRightChild() == null || node.getLeftChild() == null) {
            return null;
        }

        Node successor = node.getRightChild();

        Node successorParent = successor;

        while (successor.getLeftChild() != null) {
            successorParent = successor;
            successor = successor.getLeftChild();
            System.out.println(successor.getData());
        }

        return  (Node<T>[]) new Node[]{successor, successorParent};
    }

    void deleteNode(Node<T> node) {
        if (node == null) {
            return;
        }

        Node<T> currentNode = this.root;
        Node<T> parentNode = this.root;
        boolean isLeftChild = false;

        // find current node
        while (currentNode != null) {
            if (node.getData().compareTo(currentNode.getData()) < 0) {
                parentNode = currentNode;
                currentNode = currentNode.getLeftChild();
                isLeftChild = true;
            } else if (node.getData().compareTo(currentNode.getData()) > 0) {
                parentNode = currentNode;
                currentNode = currentNode.getRightChild();
                isLeftChild = false;
            } else {
                if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
                    currentNode = null;
                } else if (currentNode.getLeftChild() == null) {
                    if (isLeftChild) {
                        parentNode.setLeftChild(currentNode.getRightChild());
                    } else {
                        parentNode.setRightChild(currentNode.getRightChild());
                    }
                } else if (currentNode.getRightChild() == null) {
                    if (isLeftChild) {
                        parentNode.setLeftChild(currentNode.getLeftChild());
                    } else {
                        parentNode.setRightChild(currentNode.getLeftChild());
                    }
                } else {
                    Node<T> successor = this.getSuccessor(currentNode)[0];
                    Node<T> successorParent = this.getSuccessor(currentNode)[1];

                    if (currentNode.getRightChild() != successor) {
                        successor.setRightChild(currentNode.getRightChild());
                        successorParent.setLeftChild(null);
                    }
                    successor.setLeftChild(currentNode.getLeftChild());
                    if (isLeftChild) {
                        parentNode.setLeftChild(successor);
                    } else {
                        parentNode.setRightChild(successor);
                    }

                }
                return;
            }
        }
        
    }
}
