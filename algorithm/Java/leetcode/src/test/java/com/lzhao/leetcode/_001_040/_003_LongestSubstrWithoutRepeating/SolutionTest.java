package com.lzhao.leetcode._001_040._003_LongestSubstrWithoutRepeating;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 6/23/17.
 */
public class SolutionTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        Solution solution = new Solution();

        String testStr1 = "abcabcbb";
        String testStr2 = "aabbcc";
        String testStr3 = "pwwkew";
        String testStr4 = "aab";
        String testStr5 = "c";
        String testStr6 = "";
        String testStr7 = "abba";
        String testStr8 = "jbpnbwwd";
        String testStr9 = "bpfbhmipx";
        String testStr10 = "umvejcuuk";

        int result1 = solution.lengthOfLongestSubstring(testStr1);
        int result2 = solution.lengthOfLongestSubstring(testStr2);
        int result3 = solution.lengthOfLongestSubstring(testStr3);
        int result4 = solution.lengthOfLongestSubstring(testStr4);
        int result5 = solution.lengthOfLongestSubstring(testStr5);
        int result6 = solution.lengthOfLongestSubstring(testStr6);
        int result7 = solution.lengthOfLongestSubstring(testStr7);
        int result8 = solution.lengthOfLongestSubstring(testStr8);
        int result9 = solution.lengthOfLongestSubstring(testStr9);
        int result10 = solution.lengthOfLongestSubstring(testStr10);

        assertEquals(3, result1);
        assertEquals(2, result2);
        assertEquals(3, result3);
        assertEquals(2, result4);
        assertEquals(1, result5);
        assertEquals(0, result6);
        assertEquals(2, result7);
        assertEquals(4, result8);
        assertEquals(7, result9);
        assertEquals(6, result10);
    }

}