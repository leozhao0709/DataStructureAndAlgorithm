package com.lzhao.interviewPrepare.linkedin.randomList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 12/1/17.
 */
public class RandomListTest {

    private RandomList<Integer> randomList;

    @Before
    public void setUp() throws Exception {
        this.randomList = new RandomList<Integer>();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void add() throws Exception {
        this.randomList.add(10);
        this.randomList.add(20);
        this.randomList.add(20);
        this.randomList.add(20);
        this.randomList.add(30);
        this.randomList.add(40);
        this.randomList.add(50);

        System.out.println(this.randomList.getRandom());
        System.out.println(this.randomList.search(30));
        this.randomList.remove(30);
        System.out.println(this.randomList.getRandom());
    }

}