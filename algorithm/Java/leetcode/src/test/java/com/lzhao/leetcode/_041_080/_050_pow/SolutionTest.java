package com.lzhao.leetcode._041_080._050_pow;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/13/17.
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
    public void myPow() throws Exception {
        System.out.println(this.solution.myPow(0.5, 2));
        System.out.println(this.solution.myPow(1.00001, 123456));
        System.out.println(this.solution.myPow(0.00001, 2147483647));
    }

}