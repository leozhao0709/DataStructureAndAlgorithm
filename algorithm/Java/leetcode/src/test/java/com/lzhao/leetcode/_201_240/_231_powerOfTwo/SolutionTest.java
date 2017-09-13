package com.lzhao.leetcode._201_240._231_powerOfTwo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/12/17.
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
    public void isPowerOfTwo() throws Exception {
        assert this.solution.isPowerOfTwo(4);
        assert this.solution.isPowerOfTwo(16);
        assert this.solution.isPowerOfTwo(32);

        assertFalse(this.solution.isPowerOfTwo(7));
        assertFalse(this.solution.isPowerOfTwo(9));
        assertFalse(this.solution.isPowerOfTwo(3));
    }

}