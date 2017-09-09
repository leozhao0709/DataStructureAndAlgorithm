package com.lzhao.leetcode._201_240._201_bitwiseAndOfNumbersRange;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/8/17.
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
    public void rangeBitwiseAnd() throws Exception {
        assertEquals(4, this.solution.rangeBitwiseAnd(5, 7));
        assertEquals(0, this.solution.rangeBitwiseAnd(1, 2));
        assertEquals(0, this.solution.rangeBitwiseAnd(1, 5));
    }

}