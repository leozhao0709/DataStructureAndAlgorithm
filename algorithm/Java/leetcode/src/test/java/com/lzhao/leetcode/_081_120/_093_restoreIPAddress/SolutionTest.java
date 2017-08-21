package com.lzhao.leetcode._081_120._093_restoreIPAddress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/20/17.
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
    public void restoreIpAddresses() throws Exception {
        String str = "25525511135";
        str = "1111";
        str = "010010";
        System.out.println(Arrays.toString(this.solution.restoreIpAddresses(str).toArray()));
    }

}