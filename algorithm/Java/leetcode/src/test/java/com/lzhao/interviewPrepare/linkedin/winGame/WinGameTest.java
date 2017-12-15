package com.lzhao.interviewPrepare.linkedin.winGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/30/17.
 */
public class WinGameTest {

    private WinGame winGame;

    @Before
    public void setUp() throws Exception {
        this.winGame = new WinGame();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void canIWin() throws Exception {
        int max = 10;
        int total = 11;

        assertFalse(this.winGame.canIWin(max, total));
    }

}