package com.lzhao.leetcode._001_040._038_CountAndSay;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/10/17.
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
    public void countAndSay() throws Exception {
        assertEquals("1", this.solution.countAndSay(1));
        assertEquals("1211", this.solution.countAndSay(4));
    }

}