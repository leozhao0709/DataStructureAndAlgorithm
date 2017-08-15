package com.lzhao.leetcode._041_080._060_permutationSequence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/14/17.
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
    public void getPermutation() throws Exception {
        assertEquals("312", this.solution.getPermutation(3, 5));
//        assertEquals("1", this.solution.getPermutation(1, 1));
//        assertEquals("1234", this.solution.getPermutation(4, 1));

//        System.out.println(this.solution.getPermutation(9, 273815));
    }

}