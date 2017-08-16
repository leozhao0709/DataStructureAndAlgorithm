package com.lzhao.leetcode._041_080._067_addBinary;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/15/17.
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
    public void addBinary() throws Exception {
        assertEquals("100", this.solution.addBinary("11", "1"));
    }

}