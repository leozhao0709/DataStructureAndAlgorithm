package com.lzhao.leetcodeAmazon._015_3sum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 10/1/17.
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
    public void threeSum() throws Exception {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        System.out.println(Arrays.deepToString(this.solution.threeSum(nums).toArray()) );
    }

}