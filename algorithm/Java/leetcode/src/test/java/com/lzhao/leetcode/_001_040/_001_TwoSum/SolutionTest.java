package com.lzhao.leetcode._001_040._001_TwoSum;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 6/20/17.
 */
public class SolutionTest {
    @org.junit.Test
    public void twoSum() throws Exception {
        Solution solution = new Solution();
        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result1);

        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result2);
    }

}