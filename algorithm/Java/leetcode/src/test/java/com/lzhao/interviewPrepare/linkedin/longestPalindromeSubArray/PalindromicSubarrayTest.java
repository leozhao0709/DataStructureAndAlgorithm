package com.lzhao.interviewPrepare.linkedin.longestPalindromeSubArray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/27/17.
 */
public class PalindromicSubarrayTest {

    private PalindromicSubarray palindromicSubarray;

    @Before
    public void setUp() throws Exception {
        this.palindromicSubarray = new PalindromicSubarray();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void longestPalindromic() throws Exception {
        int[] arr = new int[] {1, 2, 3, 2, 1, 2, 4};
        int[] sub = this.palindromicSubarray.longestPalindromic(arr);

        System.out.println(Arrays.toString(sub));
    }

}