package com.lzhao.interviewPrepare.linkedin.longestPalindromeSubset;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/27/17.
 */
public class PalindormicSubsetTest {

    private PalindormicSubset palindormicSubset;

    @Before
    public void setUp() throws Exception {
        this.palindormicSubset = new PalindormicSubset();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void longestPalindromic() throws Exception {
        int[] arr = new int[] {1, 1, 2, 3, 4, 5, 2, 1, 26};
        int subsetLength = this.palindormicSubset.longestPalindromic(arr);
        System.out.println(subsetLength);
    }

}