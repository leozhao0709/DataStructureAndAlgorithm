package com.lzhao.leetcode._121_160._151_reverseWordsInAString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/30/17.
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
    public void reverseWords() throws Exception {
        String s = "the sky is blue";
        assertEquals("blue is sky the", this.solution.reverseWords(s));

        s = " ";
        this.solution.reverseWords(s);
    }
}