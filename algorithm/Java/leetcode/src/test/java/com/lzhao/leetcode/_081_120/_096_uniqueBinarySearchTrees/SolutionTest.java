package com.lzhao.leetcode._081_120._096_uniqueBinarySearchTrees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/20/17.
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
    public void numTrees() throws Exception {
        assertEquals(5, this.solution.numTrees(3));
    }

}