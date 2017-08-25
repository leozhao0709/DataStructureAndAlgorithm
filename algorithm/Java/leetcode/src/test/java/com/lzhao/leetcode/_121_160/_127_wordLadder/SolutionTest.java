package com.lzhao.leetcode._121_160._127_wordLadder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/24/17.
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
    public void ladderLength() throws Exception {
        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = new LinkedList<String>() {
            {
                add("hot");
                add("dot");
                add("dog");
                add("lot");
                add("log");
                add("cog");
            }
        };

        assertEquals(5, this.solution.ladderLength(beginWord, endWord, wordList));
    }

}