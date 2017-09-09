package com.lzhao.leetcode._201_240._205_isomorphicStrings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/9/17.
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
    public void isIsomorphic() throws Exception {
        assert this.solution.isIsomorphic("egg", "add");
        assert this.solution.isIsomorphic("paper", "title");
        assertFalse(this.solution.isIsomorphic("egg", "ddd"));
        assertFalse(this.solution.isIsomorphic("foo", "bar"));
    }

}