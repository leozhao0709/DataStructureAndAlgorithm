package com.lzhao.interviewPrepare.linkedin.binaryTreeUpsideDown;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/25/17.
 */
public class BinaryTreeUpsideDownTest {

    private BinaryTreeUpsideDown binaryTreeUpsideDown;

    @Before
    public void setUp() throws Exception {
        this.binaryTreeUpsideDown = new BinaryTreeUpsideDown();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void upsideDown() throws Exception {
        BinaryTreeUpsideDown.TreeNode root = new BinaryTreeUpsideDown.TreeNode(1);
        BinaryTreeUpsideDown.TreeNode node2 = new BinaryTreeUpsideDown.TreeNode(2);
        BinaryTreeUpsideDown.TreeNode node3 = new BinaryTreeUpsideDown.TreeNode(3);
        BinaryTreeUpsideDown.TreeNode node4 = new BinaryTreeUpsideDown.TreeNode(4);
        BinaryTreeUpsideDown.TreeNode node5 = new BinaryTreeUpsideDown.TreeNode(5);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println(this.binaryTreeUpsideDown.searialize(root));

        root = this.binaryTreeUpsideDown.upsideDown(root);
        System.out.println(this.binaryTreeUpsideDown.searialize(root));
    }

}