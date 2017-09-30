package com.lzhao.leetcodeLinkedin._367_validPerfectSqure;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/29/17.
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
    public void isPerfectSquare() throws Exception {
        assert this.solution.isPerfectSquare(808201);
    }

}