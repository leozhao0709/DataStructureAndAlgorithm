package com.lzhao.leetcode._001_040._005_LongestPalindromicString;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 6/24/17.
 */
public class SolutionTest {
    @Test
    public void longestPalindrome() throws Exception {

        Solution solution = new Solution();

        String testStr = "babad";
        String result = solution.longestPalindrome(testStr);

        assertEquals("bab", result);

        testStr = "cbbd";
        result = solution.longestPalindrome(testStr);
        assertEquals("bb", result);

        testStr = "a";
        result = solution.longestPalindrome(testStr);
        assertEquals("a", result);

    }

}