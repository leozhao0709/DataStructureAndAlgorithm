package com.lzhao.leetcode._041_080._058_lengthOfLastWord;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/14/17.
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
    public void lengthOfLastWord() throws Exception {
        String s = "Hello World";
        assertEquals(5, this.solution.lengthOfLastWord(s));

        s = "a ";
        assertEquals(1, this.solution.lengthOfLastWord(s));
    }

}