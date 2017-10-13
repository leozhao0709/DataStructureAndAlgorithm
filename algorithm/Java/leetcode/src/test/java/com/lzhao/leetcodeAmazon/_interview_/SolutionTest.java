package com.lzhao.leetcodeAmazon._interview_;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 10/13/17.
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
    public void generateParenthesis() throws Exception {
        List<String> res = this.solution.generateParenthesis(2);

        System.out.println(Arrays.toString(res.toArray()));
    }

}