package com.lzhao.leetcode._161_200._165_compareVersionNumbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/4/17.
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
    public void compareVersion() throws Exception {
        assertEquals(1, this.solution.compareVersion("1.1", "1.0"));
        assertEquals(-1, this.solution.compareVersion("1.1", "2.1"));
        assertEquals(0, this.solution.compareVersion("1.1", "1.1"));
        assertEquals(0, this.solution.compareVersion("1.0", "1"));
    }

}