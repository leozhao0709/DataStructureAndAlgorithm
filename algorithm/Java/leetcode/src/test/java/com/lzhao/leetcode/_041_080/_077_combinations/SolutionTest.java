package com.lzhao.leetcode._041_080._077_combinations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/16/17.
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
    public void combine() throws Exception {
        List<List<Integer>> result = this.solution.combine(4, 2);
        System.out.println(Arrays.deepToString(result.toArray()));
    }

}