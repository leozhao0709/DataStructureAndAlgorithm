package com.lzhao.leetcode._121_160._131_palindromePartitioning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/25/17.
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
    public void partition() throws Exception {
        String s = "aab";
        System.out.println(Arrays.deepToString(this.solution.partition(s).toArray()));
    }

}