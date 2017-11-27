package com.lzhao.interviewPrepare.linkedin.findLeavesOfBT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/23/17.
 */
public class FindLeavesOfBTTest {

    private FindLeavesOfBT findLeavesOfBT;

    @Before
    public void setUp() throws Exception {
        this.findLeavesOfBT = new FindLeavesOfBT();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findLeaves() throws Exception {
        FindLeavesOfBT.TreeNode root = new FindLeavesOfBT.TreeNode(1);
        FindLeavesOfBT.TreeNode node2 = new FindLeavesOfBT.TreeNode(2);
        FindLeavesOfBT.TreeNode node3 = new FindLeavesOfBT.TreeNode(3);
        FindLeavesOfBT.TreeNode node4 = new FindLeavesOfBT.TreeNode(4);
        FindLeavesOfBT.TreeNode node5 = new FindLeavesOfBT.TreeNode(5);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        List<List<Integer>> res = this.findLeavesOfBT.findLeaves(root);

        System.out.println(Arrays.deepToString(res.toArray()));
    }

}