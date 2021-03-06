package com.lzhao.leetcode._001_040._006_ZigZagConversion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/3/17.
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
    public void convert() throws Exception {
        String testStr = "PAYPALISHIRING";
        String result = this.solution.convert(testStr, 3);
        assertEquals("PAHNAPLSIIGYIR", result);

        testStr = "abcdefghkapple";
        result = this.solution.convert(testStr, 4);
        assertEquals("aglbfhpecekpda", result);
    }

}