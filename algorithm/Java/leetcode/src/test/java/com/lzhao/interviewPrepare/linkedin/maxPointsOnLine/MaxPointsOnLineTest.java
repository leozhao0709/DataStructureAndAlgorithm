package com.lzhao.interviewPrepare.linkedin.maxPointsOnLine;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/27/17.
 */
public class MaxPointsOnLineTest {

    private MaxPointsOnLine maxPointsOnLine;

    @Before
    public void setUp() throws Exception {
        this.maxPointsOnLine = new MaxPointsOnLine();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void maxPoints() throws Exception {
        MaxPointsOnLine.Point[] points = new MaxPointsOnLine.Point[]{new MaxPointsOnLine.Point(0, 0), new MaxPointsOnLine.Point(1, 1), new MaxPointsOnLine.Point(1, -1)};

        System.out.println(this.maxPointsOnLine.maxPoints(points));
    }

}