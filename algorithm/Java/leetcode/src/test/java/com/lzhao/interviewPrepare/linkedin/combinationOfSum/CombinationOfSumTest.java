package com.lzhao.interviewPrepare.linkedin.combinationOfSum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/23/17.
 */
public class CombinationOfSumTest {

    private CombinationOfSum combinationOfSum;

    @Before
    public void setUp() throws Exception {
        this.combinationOfSum = new CombinationOfSum();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void combinationSum() throws Exception {
        int[] candidates = new int[] {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> res = this.combinationOfSum.combinationSum(candidates, 8);
        System.out.println(Arrays.deepToString(res.toArray()));

        candidates = new int[] {-1, -1, -1, 3, 5, -8, -2};
        res = this.combinationOfSum.combinationSum(candidates, -2);
        System.out.println(Arrays.deepToString(res.toArray()));
    }

}