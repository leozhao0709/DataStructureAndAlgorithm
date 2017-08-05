package com.lzhao.leetcode._001_040._014_LongestCommonPrefix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/4/17.
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
    public void longestCommonPrefix() throws Exception {
        String[] test = new String[]{"abc", "ab", "abd"};

        assertEquals("ab", this.solution.longestCommonPrefix(test));

        test = new String[]{"aa", "a"};
        assertEquals("a", this.solution.longestCommonPrefix(test));
    }

}