package com.lzhao.leetcode._161_200._171_excelSheetColumnNumber;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/6/17.
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
    public void titleToNumber() throws Exception {
        assertEquals(1, this.solution.titleToNumber("A"));
        assertEquals(28, this.solution.titleToNumber("AB"));
    }

}