package com.lzhao.interviewPrepare.linkedin.intervalCoverage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 12/3/17.
 */
public class MyIntervalsTest {

    private MyIntervals myIntervals;

    @Before
    public void setUp() throws Exception {
        this.myIntervals = new MyIntervals();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTotalCoveredLength() throws Exception {
        this.myIntervals.addInterval(1, 5);
        this.myIntervals.addInterval(3, 6);
        this.myIntervals.addInterval(2, 4);
        this.myIntervals.addInterval(8, 9);

        assertEquals(6, this.myIntervals.getTotalCoveredLength());
    }

}