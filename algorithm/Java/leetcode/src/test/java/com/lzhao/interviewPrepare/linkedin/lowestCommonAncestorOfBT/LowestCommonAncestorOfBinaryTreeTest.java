package com.lzhao.interviewPrepare.linkedin.lowestCommonAncestorOfBT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/26/17.
 */
public class LowestCommonAncestorOfBinaryTreeTest {

    private LowestCommonAncestorOfBinaryTree lowestCommonAncestorOfBinaryTree;

    @Before
    public void setUp() throws Exception {
        this.lowestCommonAncestorOfBinaryTree = new LowestCommonAncestorOfBinaryTree();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void lowestCommonAncestor() throws Exception {
        LowestCommonAncestorOfBinaryTree.TreeNode root = new LowestCommonAncestorOfBinaryTree.TreeNode(3);
        LowestCommonAncestorOfBinaryTree.TreeNode node5 = new LowestCommonAncestorOfBinaryTree.TreeNode(5);
        LowestCommonAncestorOfBinaryTree.TreeNode node1 = new LowestCommonAncestorOfBinaryTree.TreeNode(1);
        LowestCommonAncestorOfBinaryTree.TreeNode node6= new LowestCommonAncestorOfBinaryTree.TreeNode(6);
        LowestCommonAncestorOfBinaryTree.TreeNode node2 = new LowestCommonAncestorOfBinaryTree.TreeNode(2);
        LowestCommonAncestorOfBinaryTree.TreeNode node0 = new LowestCommonAncestorOfBinaryTree.TreeNode(0);
        LowestCommonAncestorOfBinaryTree.TreeNode node8 = new LowestCommonAncestorOfBinaryTree.TreeNode(8);
        LowestCommonAncestorOfBinaryTree.TreeNode node7 = new LowestCommonAncestorOfBinaryTree.TreeNode(7);
        LowestCommonAncestorOfBinaryTree.TreeNode node4 = new LowestCommonAncestorOfBinaryTree.TreeNode(4);

        root.left = node5;
        root.right = node1;
        node5.left = node6;
        node5.right = node2;
        node1.left = node0;
        node1.right = node8;
        node2.left = node7;
        node2.right = node4;

        LowestCommonAncestorOfBinaryTree.TreeNode node10 = new LowestCommonAncestorOfBinaryTree.TreeNode(10);

        int data = this.lowestCommonAncestorOfBinaryTree.lowestCommonAncestor(root, node5, node10).val;
        System.out.println(data);
    }

}