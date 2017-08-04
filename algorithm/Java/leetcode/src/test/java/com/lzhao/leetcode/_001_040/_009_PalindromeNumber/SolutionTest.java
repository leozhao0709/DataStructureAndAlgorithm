package com.lzhao.leetcode._001_040._009_PalindromeNumber;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/3/17.
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

        assert (this.solution.isPalindrome(989));
        assert (this.solution.isPalindrome(9889));
        assert (this.solution.isPalindrome(0));
        assert (this.solution.isPalindrome(5));
        assertFalse (this.solution.isPalindrome(-5));
        assertFalse(this.solution.isPalindrome(98));
        assertFalse(this.solution.isPalindrome(100));
    }

}