package com.lzhao.interviewPrepare.linkedin.maxStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 12/6/17.
 */
public class MaxStackTest {

    private MaxStack stack;

    @Before
    public void setUp() throws Exception {
        this.stack = new MaxStack();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {
        stack.push(5);
        stack.push(1);
        stack.push(5);

        assertEquals(5, stack.peek());
        assertEquals(5, stack.popMax());
        assertEquals(1, stack.peek());
        assertEquals(5, stack.peekMax());
        assertEquals(1, stack.pop());
        assertEquals(5, stack.peek());
    }

}