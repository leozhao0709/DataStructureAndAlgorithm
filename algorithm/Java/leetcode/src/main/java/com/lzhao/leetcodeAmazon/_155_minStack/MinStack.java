package com.lzhao.leetcodeAmazon._155_minStack;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by lzhao on 10/10/17.
 */

class MinStack {

    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> minIndexList;

    public MinStack() {
        this.arrayList = new ArrayList<Integer>();
        this.minIndexList = new LinkedList<Integer>();
    }

    public void push(int x) {
        if (this.minIndexList.size() == 0) {
            this.minIndexList.add(0);
        } else if (x < this.getMin()) {
            this.minIndexList.add(this.arrayList.size());
        }
        this.arrayList.add(x);
    }

    public void pop() {
        if (this.minIndexList.getLast() == this.arrayList.size()-1) {
            this.minIndexList.removeLast();
        }

        this.arrayList.remove(this.arrayList.size()-1);
    }

    public int top() {
        return this.arrayList.get(this.arrayList.size()-1);
    }

    public int getMin() {
        return this.arrayList.get(this.minIndexList.getLast());
    }
}
