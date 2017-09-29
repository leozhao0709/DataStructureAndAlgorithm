package com.lzhao.leetcodeLinkedin._254_factorCombinations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/28/17.
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
    public void getFactors() throws Exception {
        List<List<Integer>> list = this.solution.getFactors(12);
        System.out.println(Arrays.deepToString(list.toArray()));
    }

}