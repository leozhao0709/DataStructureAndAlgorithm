package com.lzhao.interviewPrepare.linkedin.partitionKequalSumSubsets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/29/17.
 */
public class PartitionKsubsetTest {

    private PartitionKsubset partitionKsubset;

    @Before
    public void setUp() throws Exception {
        this.partitionKsubset = new PartitionKsubset();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void canPartitionKSubsets() throws Exception {
        int[] nums = new int[] {4, 3, 2, 3, 5, 2, 1};
        int k = 4;

        assert this.partitionKsubset.canPartitionKSubsets(nums, k);
    }

    @Test
    public void partitionKSubsets() throws Exception {
        int[] nums = new int[] {4, 3, 2, 3, 5, 2, 1};
        int k = 2;

        List<List<Integer>> res = this.partitionKsubset.partitionKSubsets(nums, k);

        System.out.println(Arrays.deepToString(res.toArray()));
    }

}