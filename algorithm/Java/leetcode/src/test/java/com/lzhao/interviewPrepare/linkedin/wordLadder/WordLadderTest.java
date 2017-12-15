package com.lzhao.interviewPrepare.linkedin.wordLadder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/23/17.
 */
public class WordLadderTest {

    private WordLadder wordLadder;

    @Before
    public void setUp() throws Exception {
        this.wordLadder = new WordLadder();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findLadders() throws Exception {
//        String beginWord = "hit";
//        String endWord = "cog";
//        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
//
//        List<String> res = this.wordLadder.findLadders(beginWord, endWord, wordList);
//
//        System.out.println(Arrays.deepToString(res.toArray()));


        String beginWord = "hot";
        String endWord = "dog";
        List<String> wordList = Arrays.asList("hot","dog","dot");

        List<String> res = this.wordLadder.findLadders(beginWord, endWord, wordList);

        System.out.println(Arrays.deepToString(res.toArray()));
    }

}