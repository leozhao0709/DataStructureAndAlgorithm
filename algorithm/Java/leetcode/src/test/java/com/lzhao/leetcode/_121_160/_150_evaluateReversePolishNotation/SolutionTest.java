package com.lzhao.leetcode._121_160._150_evaluateReversePolishNotation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/29/17.
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
    public void evalRPN() throws Exception {
        String[] tokens = {"2", "1", "+", "3", "*"};

        assertEquals(9, this.solution.evalRPN(tokens));

        tokens = new String[]{"4", "13", "5", "/", "+"};
        assertEquals(6, this.solution.evalRPN(tokens));
    }

}