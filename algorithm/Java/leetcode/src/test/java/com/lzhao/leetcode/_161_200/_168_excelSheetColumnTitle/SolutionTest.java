package com.lzhao.leetcode._161_200._168_excelSheetColumnTitle;

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
    public void convertToTitle() throws Exception {
        assertEquals("A", this.solution.convertToTitle(1));
        assertEquals("AA", this.solution.convertToTitle(27));
        assertEquals("AB", this.solution.convertToTitle(28));
    }

}