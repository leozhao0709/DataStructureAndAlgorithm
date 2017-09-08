package com.lzhao.leetcode._161_200._187_repeatedDNASequence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/7/17.
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
    public void findRepeatedDnaSequences() throws Exception {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(Arrays.toString(this.solution.findRepeatedDnaSequences(s).toArray()));
        s = "AAAAAAAAAAA";
        System.out.println(Arrays.toString(this.solution.findRepeatedDnaSequences(s).toArray()));
        s = "AAAAAAAAAAAA";
        System.out.println(Arrays.toString(this.solution.findRepeatedDnaSequences(s).toArray()));

    }

}