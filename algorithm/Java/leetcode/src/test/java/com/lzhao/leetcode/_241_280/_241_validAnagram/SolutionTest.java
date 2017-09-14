package com.lzhao.leetcode._241_280._241_validAnagram;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/13/17.
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
    public void isAnagram() throws Exception {
        assert this.solution.isAnagram("anagram", "nagaram");
        assertFalse(this.solution.isAnagram("rat", "cat"));
    }

}