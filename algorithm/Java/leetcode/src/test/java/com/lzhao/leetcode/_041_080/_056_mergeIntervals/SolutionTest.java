package com.lzhao.leetcode._041_080._056_mergeIntervals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
    public void merge() throws Exception {
        List<Interval> intervals = new LinkedList<Interval>() {{
           add(new Interval(1, 3));
           add(new Interval(2, 6));
           add(new Interval(8, 10));
           add(new Interval(15, 18));
        }};

        System.out.println(Arrays.toString(this.solution.merge(intervals).toArray()));
    }

}