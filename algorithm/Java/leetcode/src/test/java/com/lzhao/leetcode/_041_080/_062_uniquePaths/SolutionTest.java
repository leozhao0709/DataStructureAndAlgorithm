package com.lzhao.leetcode._041_080._062_uniquePaths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by lzhao on 8/15/17.
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
    public void uniquePaths() throws Exception {
        System.out.println(this.solution.uniquePaths(3, 7));
    }

}