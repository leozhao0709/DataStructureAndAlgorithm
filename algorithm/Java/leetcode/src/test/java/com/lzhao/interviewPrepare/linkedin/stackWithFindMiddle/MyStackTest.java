package com.lzhao.interviewPrepare.linkedin.stackWithFindMiddle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 12/1/17.
 */
public class MyStackTest {

    private MyStack stack;

    @Before
    public void setUp() throws Exception {
        this.stack = new MyStack();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {
        stack.push(1);
        stack.push(3);
        stack.push(6);
        stack.push(5);
        stack.push(4);

        //1, 3, 6, 5, 4
        assertEquals(6, this.stack.peekMid());
        assertEquals(4, this.stack.peek());

        //1, 3, 6, 5
        assertEquals(4, this.stack.pop());
        assertEquals(3, this.stack.peekMid());
        assertEquals(5, this.stack.peek());

        //1, 6, 5
        assertEquals(3, this.stack.popMid());
        assertEquals(6, this.stack.peekMid());

        //1, 6
        assertEquals(5, this.stack.pop());

        //1, 6, 10, 11, 12
        stack.push(10);
        stack.push(11);
        stack.push(12);

        //1, 6, 10, 11, 12
        assertEquals(10, this.stack.peekMid());
        assertEquals(12, this.stack.peek());

        //1, 6, 11, 12
        assertEquals(10, this.stack.popMid());
        assertEquals(6, this.stack.peekMid());

        //1, 11, 12
        assertEquals(12, this.stack.pop());
    }

}