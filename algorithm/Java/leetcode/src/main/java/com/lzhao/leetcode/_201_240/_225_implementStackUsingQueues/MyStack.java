package com.lzhao.leetcode._201_240._225_implementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lzhao on 9/11/17.
 */

class MyStack {

    private Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        this.queue = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        this.queue.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = this.queue.size();
        int res = 0;
        for (int i = 0; i < size; i++)
        {
            if (i != size-1) {
                this.queue.offer(this.queue.poll());
            } else {
                res = this.queue.poll();
            }
        }

        return res;
    }

    /** Get the top element. */
    public int top() {
        int size = this.queue.size();
        int res = 0;
        for (int i = 0; i < size; i++)
        {
            int curr = this.queue.poll();
            this.queue.offer(curr);
            res = curr;
        }

        return res;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.queue.isEmpty();
    }
}
