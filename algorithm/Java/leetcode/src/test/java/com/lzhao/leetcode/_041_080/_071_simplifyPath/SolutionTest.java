package com.lzhao.leetcode._041_080._071_simplifyPath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/16/17.
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
    public void simplifyPath() throws Exception {
        String path = "/../";
        assertEquals("/", this.solution.simplifyPath(path));

        path = "/a/./b/../../c/";
        assertEquals("/c", this.solution.simplifyPath(path));

        path = "/abc/...";
        assertEquals("/abc/...", this.solution.simplifyPath(path));
    }

}