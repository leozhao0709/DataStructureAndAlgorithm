package com.lzhao.leetcode._201_240._224_basicCalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/11/17.
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
    public void calculate() throws Exception {
        assertEquals(2, this.solution.calculate("1 + 1"));
        assertEquals(3, this.solution.calculate(" 2-1 + 2 "));
        assertEquals(23, this.solution.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

}