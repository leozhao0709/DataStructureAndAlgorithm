package com.lzhao.leetcode._281_320._290_wordPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/14/17.
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
    public void wordPattern() throws Exception {
        assert this.solution.wordPattern("abba", "dog cat cat dog");
        assertFalse(this.solution.wordPattern("abba", "dog cat cat fish"));
        assertFalse(this.solution.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(this.solution.wordPattern("abba", "dog dog dog dog"));
    }

}