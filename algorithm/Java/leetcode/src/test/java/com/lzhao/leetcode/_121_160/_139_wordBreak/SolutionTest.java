package com.lzhao.leetcode._121_160._139_wordBreak;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/26/17.
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
    public void wordBreak() throws Exception {
        String s = "leetcode";
        List<String> wordDict = new LinkedList<String>() {{
            add("leet");
            add("code");
        }};

        assert this.solution.wordBreak(s, wordDict);
    }

}