package com.lzhao.leetcode._081_120._120_triangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/22/17.
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
    public void minimumTotal() throws Exception {
        List<List<Integer>> triangle = new LinkedList<List<Integer>>();

        List<Integer> row0 = new LinkedList<Integer>() {
            {
                add(2);
            }
        };

        List<Integer> row1 = new LinkedList<Integer>() {
            {
                add(3);
                add(4);
            }
        };

        List<Integer> row2= new LinkedList<Integer>() {
            {
                add(6);
                add(5);
                add(7);
            }
        };

        List<Integer> row3 = new LinkedList<Integer>() {
            {
                add(4);
                add(1);
                add(8);
                add(3);
            }
        };

        triangle.add(row0);
        triangle.add(row1);
        triangle.add(row2);
        triangle.add(row3);

        assertEquals(11, this.solution.minimumTotal(triangle));
    }

}