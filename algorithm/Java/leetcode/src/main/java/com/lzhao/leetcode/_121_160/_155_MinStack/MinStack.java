package com.lzhao.leetcode._121_160._155_MinStack;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by lzhao on 8/31/17.
 */

class MinStack {

    private LinkedList<Integer> minIndexList;
    private ArrayList<Integer> list;
    private int currentIndex;

    public MinStack() {
        this.list = new ArrayList<Integer>();
        this.minIndexList = new LinkedList<Integer>();
        currentIndex = 0;
    }

    public void push(int x) {
        this.list.add(x);

        if (this.currentIndex == 0) {
            this.minIndexList.add(0);
        } else {
            if (x < this.list.get(this.minIndexList.getLast())) {
                this.minIndexList.add(currentIndex);
            }
        }

        currentIndex++;
    }

    public void pop() {
        this.list.remove(currentIndex-1);
        if (currentIndex - 1 == this.minIndexList.getLast()) {
            this.minIndexList.removeLast();
        }
        currentIndex--;
    }

    public int top() {
        return this.list.get(currentIndex-1);
    }

    public int getMin() {
        return this.list.get(this.minIndexList.getLast());
    }

}
