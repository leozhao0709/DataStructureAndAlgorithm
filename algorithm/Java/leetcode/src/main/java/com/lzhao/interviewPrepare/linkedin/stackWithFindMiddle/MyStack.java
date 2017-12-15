package com.lzhao.interviewPrepare.linkedin.stackWithFindMiddle;

/**
 * Created by lzhao on 12/1/17.
 */

class MyStack {

    static class ListNode {
        int val;
        ListNode prev;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }

    private ListNode head;
    private ListNode tail;
    private ListNode mid;
    private int count;

    MyStack() {
        this.head = new ListNode(0);
        this.tail = new ListNode(0);
        this.mid = head;
        this.head.next = tail;
        this.tail.prev = this.head;
        this.count = 0;
    }

    void push(int x) {
        ListNode node = new ListNode(x);

        this.tail.prev.next = node;
        node.prev = this.tail.prev;
        node.next = this.tail;
        this.tail.prev = node;
        this.count++;

        if (count % 2 == 1) {
            this.mid = mid.next;
        }
    }

    int pop() {
        this.count--;
        ListNode node = this.tail.prev;
        node.prev.next = this.tail;
        this.tail.prev = node.prev;

        if (count % 2 == 0) {
            this.mid = mid.prev;
        }

        return node.val;
    }

    int peek() {
        return this.tail.prev.val;
    }

    int peekMid() {
        return this.mid.val;
    }

    int popMid() {
        ListNode node = this.mid;


        node.prev.next = node.next;
        node.next.prev = node.prev;

        if (this.count % 2 == 1) {
            this.mid = this.mid.prev;
        } else {
            this.mid = this.mid.next;
        }
        this.count--;

        return node.val;
    }
}
