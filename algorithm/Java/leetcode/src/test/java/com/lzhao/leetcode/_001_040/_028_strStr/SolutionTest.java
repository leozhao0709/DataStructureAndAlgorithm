package com.lzhao.leetcode._001_040._028_strStr;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/7/17.
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
    public void strStr() throws Exception {
        String haystack = "a";
        String needle = "";

        int i = this.solution.strStr(haystack, needle);

        System.out.println(i);
    }

}