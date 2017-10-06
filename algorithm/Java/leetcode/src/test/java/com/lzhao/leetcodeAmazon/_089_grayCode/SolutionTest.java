package com.lzhao.leetcodeAmazon._089_grayCode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * Created by lzhao on 10/5/17.
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
    public void grayCode() throws Exception {
        int n = 3;
        List<Integer> result = this.solution.grayCode(n);

        System.out.println(Arrays.toString(result.toArray()));
    }

}