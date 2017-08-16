package com.lzhao.leetcode._041_080._069_sqrt;

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
    public void mySqrt() throws Exception {
        assertEquals(1, this.solution.mySqrt(1));
        assertEquals(1, this.solution.mySqrt(2));
        assertEquals(1, this.solution.mySqrt(3));
        assertEquals(2, this.solution.mySqrt(4));
        assertEquals(2, this.solution.mySqrt(5));
        assertEquals(2, this.solution.mySqrt(6));
        assertEquals(2, this.solution.mySqrt(7));
        assertEquals(2, this.solution.mySqrt(8));
        assertEquals(3, this.solution.mySqrt(9));
        assertEquals(3, this.solution.mySqrt(10));
        assertEquals(46339, this.solution.mySqrt(2147395599));
    }

}