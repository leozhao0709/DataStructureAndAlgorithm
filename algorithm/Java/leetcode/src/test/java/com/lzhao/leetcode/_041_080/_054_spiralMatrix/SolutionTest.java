package com.lzhao.leetcode._041_080._054_spiralMatrix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/14/17.
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
    public void spiralOrder() throws Exception {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(this.solution.spiralOrder(matrix).toArray()));

        matrix = new int[][]{{1,2,3}};
//        System.out.println(Arrays.toString(this.solution.spiralOrder(matrix).toArray()));

        matrix = new int[][]{{1}, {2}, {3}};
//        System.out.println(this.solution.spiralOrder(matrix));
    }

}