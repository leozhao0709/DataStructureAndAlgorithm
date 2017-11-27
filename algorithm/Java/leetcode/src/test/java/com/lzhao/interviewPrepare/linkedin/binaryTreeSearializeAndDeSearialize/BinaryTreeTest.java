package com.lzhao.interviewPrepare.linkedin.binaryTreeSearializeAndDeSearialize;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lzhao on 11/23/17.
 */
public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @Before
    public void setUp() throws Exception {
        this.binaryTree = new BinaryTree();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void searialize() throws Exception {
        BinaryTree.TreeNode root = new BinaryTree.TreeNode(1);
        BinaryTree.TreeNode node2 = new BinaryTree.TreeNode(2);
        BinaryTree.TreeNode node3 = new BinaryTree.TreeNode(3);
        BinaryTree.TreeNode node4 = new BinaryTree.TreeNode(4);
        BinaryTree.TreeNode node5 = new BinaryTree.TreeNode(5);

        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;

        String s = this.binaryTree.searialize(root);
        System.out.println(s);

        BinaryTree.TreeNode desearializeRoot = this.binaryTree.desearialize(s);
        this.binaryTree.preOrderTraverse(desearializeRoot);
    }

}