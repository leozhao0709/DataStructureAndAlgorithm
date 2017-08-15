package com.lzhao.leetcode._041_080._055_jumpGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void canJump() throws Exception {
        int[] A = {2,3,1,1,4};
        assert this.solution.canJump(A);

        A = new int[] {3,2,1,0,4};
        assertFalse(this.solution.canJump(A));

        A = new int[] {3,0,8,2,0,0,1};
        assert this.solution.canJump(A);

    }

}