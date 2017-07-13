package tree.binary;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 7/12/17.
 */
public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> tree;

    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree<Integer>();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void inOrderTraverse() throws Exception {
        this.tree = BinarySearchTree.createTree();
        this.tree.inOrderTraverse(this.tree.getRoot());
    }

    @Test
    public void insertNode() throws Exception {

        int[] arr = new int[] {55, 34, 56, 90, 78, 65, 1, 9, 8, 57};

        for (int anArr : arr) {
            this.tree.insertNode(new Node<Integer>(anArr));
        }

        this.tree.inOrderTraverse(this.tree.getRoot());

    }

    @Test
    public void findNode() throws Exception {
        int[] arr = new int[] {55, 34, 56, 90, 78, 65, 1, 9, 8};

        for (int anArr : arr) {
            this.tree.insertNode(new Node<Integer>(anArr));
        }

        assertTrue(this.tree.findNode(new Node<Integer>(55)));
        assertTrue(this.tree.findNode(new Node<Integer>(8)));
        assertTrue(this.tree.findNode(new Node<Integer>(9)));
        assertTrue(this.tree.findNode(new Node<Integer>(78)));
        assertFalse(this.tree.findNode(new Node<Integer>(10)));
        assertFalse(this.tree.findNode(new Node<Integer>(11)));
    }

}