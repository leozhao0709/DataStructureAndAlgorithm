package com.lzhao.leetcode._001_040._029_DivideTwoIntegers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/8/17.
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
    public void divide() throws Exception {
        assertEquals(5, this.solution.divide(25, 5));
        assertEquals(Integer.MAX_VALUE, this.solution.divide(25, 0));
        assertEquals(5, this.solution.divide(28, 5));
        assertEquals(-1, this.solution.divide(-1, 1));
        assertEquals(2147483647, this.solution.divide(-2147483648, -1));
        assertEquals(-2147483648, this.solution.divide(-2147483648, 1));
    }

}