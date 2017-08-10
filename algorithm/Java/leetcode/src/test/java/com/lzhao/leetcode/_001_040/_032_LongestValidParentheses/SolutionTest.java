package com.lzhao.leetcode._001_040._032_LongestValidParentheses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/9/17.
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
    public void longestValidParentheses() throws Exception {
        String s = "(()";
        assertEquals(2, this.solution.longestValidParentheses(s));

        s = ")()())";
        assertEquals(4, this.solution.longestValidParentheses(s));

        s = "()(()";
        assertEquals(2, this.solution.longestValidParentheses(s));

        s = "(()()";
        assertEquals(4, this.solution.longestValidParentheses(s));

        s = "()()()";
        assertEquals(6, this.solution.longestValidParentheses(s));

        s = "((()()()))";
        assertEquals(10, this.solution.longestValidParentheses(s));
    }

}