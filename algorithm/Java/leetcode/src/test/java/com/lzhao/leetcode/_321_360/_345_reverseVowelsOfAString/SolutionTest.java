package com.lzhao.leetcode._321_360._345_reverseVowelsOfAString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/20/17.
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
    public void reverseVowels() throws Exception {
        assertEquals("holle", this.solution.reverseVowels("hello"));
        assertEquals("leotcede", this.solution.reverseVowels("leetcode"));
    }

}