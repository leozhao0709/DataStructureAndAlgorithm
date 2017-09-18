package com.lzhao.leetcode._281_320._299_bullsAndCows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/17/17.
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
    public void getHint() throws Exception {
        assertEquals("1A3B", this.solution.getHint("1807", "7810"));
        assertEquals("1A1B", this.solution.getHint("1123", "0111"));
        assertEquals("3A0B", this.solution.getHint("1122", "1222"));
    }

}