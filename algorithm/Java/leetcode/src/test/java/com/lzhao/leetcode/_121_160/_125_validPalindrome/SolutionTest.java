package com.lzhao.leetcode._121_160._125_validPalindrome;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by lzhao on 8/23/17.
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
    public void isPalindrome() throws Exception {
        String s = "A man, a plan, a canal: Panama";
        assert this.solution.isPalindrome(s);

        s = "race a car";
        assertFalse(this.solution.isPalindrome(s));
    }

}