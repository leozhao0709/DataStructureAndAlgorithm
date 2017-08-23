package com.lzhao.leetcode._121_160._122_bestTimeToBuyAndSellStock2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/22/17.
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
    public void maxProfit() throws Exception {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(7, this.solution.maxProfit(prices));

        prices = new int[] {7, 6, 5, 4, 3, 1};
        assertEquals(0, this.solution.maxProfit(prices));
    }

}