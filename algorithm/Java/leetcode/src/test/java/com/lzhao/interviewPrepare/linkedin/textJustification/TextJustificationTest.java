package com.lzhao.interviewPrepare.linkedin.textJustification;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 12/4/17.
 */
public class TextJustificationTest {

    private TextJustification textJustification;

    @Before
    public void setUp() throws Exception {
        this.textJustification = new TextJustification();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void fullJustify() throws Exception {
        String[] words = new String[] {"a", "b", "c", "d", "e"};
        int maxLength = 3;
        List<String> res = this.textJustification.fullJustify(words, maxLength);
        System.out.println(Arrays.toString(res.toArray()));

//        int[] a= new int[]{1, 2, 3, 3,4};
//        System.out.println(Arrays.toString(a));
    }

}