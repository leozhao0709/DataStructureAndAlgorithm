package com.lzhao.leetcode._001_040._007_ReverseInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/3/17.
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
    public void reverse() throws Exception {
        int x = 123;
        assertEquals(321, this.solution.reverse(x));

        x = -123;
        assertEquals(-321, this.solution.reverse(x));

        x = 1534236469;
        assertEquals(0, this.solution.reverse(x));
    }

}