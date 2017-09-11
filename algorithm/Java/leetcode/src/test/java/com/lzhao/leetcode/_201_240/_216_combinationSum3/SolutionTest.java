package com.lzhao.leetcode._201_240._216_combinationSum3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/10/17.
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
    public void combinationSum3() throws Exception {
//        System.out.println(Arrays.deepToString(this.solution.combinationSum3(3, 7).toArray()));
        System.out.println(Arrays.deepToString(this.solution.combinationSum3(3, 9).toArray()));
    }

}