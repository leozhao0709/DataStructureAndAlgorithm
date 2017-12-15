package com.lzhao.interviewPrepare.linkedin.minimumWindowSubstring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/29/17.
 */
public class MinimumWindowSubstringTest {

    private MinimumWindowSubstring minimumWindowSubstring;

    @Before
    public void setUp() throws Exception {
        this.minimumWindowSubstring = new MinimumWindowSubstring();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void minWindow() throws Exception {
        String s = "bba";
        String t = "ab";

        assertEquals("ba", this.minimumWindowSubstring.minWindow(s, t));
    }

}