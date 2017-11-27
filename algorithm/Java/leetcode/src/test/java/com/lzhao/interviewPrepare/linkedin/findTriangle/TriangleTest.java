package com.lzhao.interviewPrepare.linkedin.findTriangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 11/24/17.
 */
public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        this.triangle = new Triangle();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findTriangle() throws Exception {
        int[] arrs = new int[] {4, 6, 3, 7};
        List<List<Integer>> triangles = this.triangle.findTriangle(arrs);
        System.out.println(this.triangle.countTriangle(arrs) + Arrays.deepToString(triangles.toArray()));

        arrs = new int[] {100, 101, 200, 300, 10, 21, 22};
        triangles = this.triangle.findTriangle(arrs);
        System.out.println(this.triangle.countTriangle(arrs) + Arrays.deepToString(triangles.toArray()));
    }


}