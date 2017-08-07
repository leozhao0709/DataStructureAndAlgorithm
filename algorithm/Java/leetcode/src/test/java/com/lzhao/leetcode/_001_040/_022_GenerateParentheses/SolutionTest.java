package com.lzhao.leetcode._001_040._022_GenerateParentheses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/6/17.
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
        List<String> list = this.solution.generateParenthesis(
                3
        );

        System.out.println(Arrays.toString(list.toArray()));
    }

}