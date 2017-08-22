package com.lzhao.leetcode._081_120._118_pascalTriangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/22/17.
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
    public void generate() throws Exception {
        int n = 5;
        System.out.println(Arrays.deepToString(this.solution.generate(n).toArray()));
    }

}