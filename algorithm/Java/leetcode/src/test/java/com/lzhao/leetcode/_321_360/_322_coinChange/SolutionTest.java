package com.lzhao.leetcode._321_360._322_coinChange;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/19/17.
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
    public void coinChange() throws Exception {
        int[] coins = new int[] {1, 2, 5};
        assertEquals(3, this.solution.coinChange(coins, 11));

        coins = new int[] {2};
        assertEquals(-1, this.solution.coinChange(coins, 3));

        coins = new int[] {1, 10, 14, 25};
        assertEquals(2, this.solution.coinChange(coins, 28));
    }

}