package com.lzhao.interviewPrepare.linkedin.doubleSqrt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/21/17.
 */
public class DoubleSqrtTest {

    private DoubleSqrt doubleSqrt;

    @Before
    public void setUp() throws Exception {
        this.doubleSqrt = new DoubleSqrt();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void mySqrt() throws Exception {
        System.out.println(this.doubleSqrt.mySqrt(0.36, 10));
    }

}