package tree.binary;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lzhao on 7/8/17.
 */
public class BinaryTreeTest {

    private BinaryTree<String> tree;

    @Before
    public void setUp() throws Exception {
        Node<String> root = new Node<String>("A");
        this.tree = BinaryTree.createTree(root);
    }

    @Test
    public void preOrderTraverse() throws Exception {
        this.tree.preOrderTraverse(this.tree.getRoot());
    }

    @Test
    public void inOrderTraverse() throws Exception {
        this.tree.inOrderTraverse(this.tree.getRoot());
    }

    @Test
    public void postOrderTraverse() throws Exception {
        this.tree.postOrderTraverse(this.tree.getRoot());
    }

    @Test
    public void preOrderTraverseNonRec() throws Exception {
        this.tree.preOrderTraverseNonRec(this.tree.getRoot());
    }

    @Test
    public void inOrderTraverseNonRec() throws Exception {
        this.tree.inOrderTraverseNonRec(this.tree.getRoot());
    }

    @Test
    public void postOrderTraverseNonRec() throws Exception {
        this.tree.postOrderTraverseNonRec(this.tree.getRoot());
    }

}