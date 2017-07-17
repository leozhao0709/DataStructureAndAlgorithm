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

    /**
     *
     * @throws Exception
     *
     *                  55
     *                /     \
     *              34      56
     *             /           \
     *            1             90
     *          /   \          /  \
     *         0     9       78    95
     *              /  \       \
     *             8   11       65
     *
     */
    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree<Integer>();

        int[] arr = new int[] {55, 34, 56, 90, 78, 65, 1, 9, 8, 11, 0, 95};

        for (int anArr : arr) {
            this.tree.insertNode(new Node<Integer>(anArr));
        }
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

        this.tree.inOrderTraverse(this.tree.getRoot());

    }

    @Test
    public void findNode() throws Exception {

        assertEquals(55, (int)this.tree.findNode(new Node<Integer>(55)).getData());
        assertEquals(8, (int)this.tree.findNode(new Node<Integer>(8)).getData());
        assertEquals(9, (int)this.tree.findNode(new Node<Integer>(9)).getData());
        assertEquals(78, (int)this.tree.findNode(new Node<Integer>(78)).getData());
        assertEquals(11, (int)this.tree.findNode(new Node<Integer>(11)).getData());
        assertEquals(null, this.tree.findNode(new Node<Integer>(10)));
    }

    @Test
    public void findMinNode() throws Exception {
        assertEquals(0, (int)this.tree.findMinNode(this.tree.getRoot()).getData());
    }

    @Test
    public void deleteNode() throws Exception {
        this.tree.deleteNode(new Node<Integer>(55));

        this.tree.inOrderTraverse(this.tree.getRoot());
    }

}