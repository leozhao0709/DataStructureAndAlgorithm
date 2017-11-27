package com.lzhao.interviewPrepare.linkedin.reverseString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/24/17.
 */
public class ReverseStringTest {

    private ReverseString reverseString;

    @Before
    public void setUp() throws Exception {
        this.reverseString = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void reverseString() throws Exception {
        String str = "the sky is blue!";
        System.out.println(this.reverseString.reverseString(str));

        str = "   a   b ";
        System.out.println(this.reverseString.reverseString(str));
    }

}