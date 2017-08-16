package com.lzhao.leetcode._041_080._070_climbingStairs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/16/17.
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
    public void climbStairs() throws Exception {
        assertEquals(1, this.solution.climbStairs(1));
        assertEquals(2, this.solution.climbStairs(2));
        assertEquals(3, this.solution.climbStairs(3));
    }

}