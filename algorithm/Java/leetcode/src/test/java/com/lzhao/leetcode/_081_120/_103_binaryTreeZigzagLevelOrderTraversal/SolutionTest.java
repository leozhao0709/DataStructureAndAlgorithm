package com.lzhao.leetcode._081_120._103_binaryTreeZigzagLevelOrderTraversal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/21/17.
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void zigzagLevelOrder() throws Exception {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

//        root.left = node1;
//        root.right = node2;
//        node2.left = node3;
//        node2.right = node4;
//
//        System.out.println(Arrays.deepToString(this.solution.zigzagLevelOrder(root).toArray()));

        root = new TreeNode(1);
        node1 = new TreeNode(2);
        node2 = new TreeNode(3);
        node3 = new TreeNode(4);
        node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        System.out.println(Arrays.deepToString(this.solution.zigzagLevelOrder(root).toArray()));
    }

}