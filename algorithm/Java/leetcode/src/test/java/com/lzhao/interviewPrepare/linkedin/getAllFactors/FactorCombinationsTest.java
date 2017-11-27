package com.lzhao.interviewPrepare.linkedin.getAllFactors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/25/17.
 */
public class FactorCombinationsTest {

    private FactorCombinations factorCombinations;

    @Before
    public void setUp() throws Exception {
        this.factorCombinations = new FactorCombinations();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAllCombinations() throws Exception {
        int n = 36;
        List<List<Integer>> res = this.factorCombinations.getAllCombinations(n);
        System.out.println(Arrays.deepToString(res.toArray()));
    }

}