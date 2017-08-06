package com.lzhao.leetcode._001_040._017_LetterCombinations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/5/17.
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
    public void letterCombinations() throws Exception {
        String testStr = "23";
        List<String> result = this.solution.letterCombinations(testStr);
        System.out.println(Arrays.toString(result.toArray()));
    }

}