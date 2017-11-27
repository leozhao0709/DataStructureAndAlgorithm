package com.lzhao.interviewPrepare.linkedin.treePathSum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 11/24/17.
 */
public class TreePathSumTest {

    private TreePathSum treePathSum;

    @Before
    public void setUp() throws Exception {
        this.treePathSum = new TreePathSum();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void pathSum() throws Exception {
        TreePathSum.TreeNode root = new TreePathSum.TreeNode(5);
        TreePathSum.TreeNode node21 = new TreePathSum.TreeNode(4);
        TreePathSum.TreeNode node22 = new TreePathSum.TreeNode(8);
        TreePathSum.TreeNode node31 = new TreePathSum.TreeNode(11);
        TreePathSum.TreeNode node33 = new TreePathSum.TreeNode(13);
        TreePathSum.TreeNode node34 = new TreePathSum.TreeNode(4);
        TreePathSum.TreeNode node41 = new TreePathSum.TreeNode(7);
        TreePathSum.TreeNode node42 = new TreePathSum.TreeNode(2);
        TreePathSum.TreeNode node47 = new TreePathSum.TreeNode(5);
        TreePathSum.TreeNode node48 = new TreePathSum.TreeNode(1);

        root.left = node21;
        root.right = node22;
        node21.left = node31;
        node22.left = node33;
        node22.right = node34;
        node31.left = node41;
        node31.right = node42;
        node34.left = node47;
        node34.right = node48;

        List<Integer> res = this.treePathSum.pathSum(root, 26);
        System.out.println(Arrays.deepToString(res.toArray()));

    }

}