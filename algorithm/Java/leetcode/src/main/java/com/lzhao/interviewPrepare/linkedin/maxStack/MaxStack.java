package com.lzhao.interviewPrepare.linkedin.maxStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by lzhao on 12/6/17.
 */

class MaxStack {

    class ListNode {
        int val;
        ListNode prev;
        ListNode next;
        ListNode(int x) {
            this.val = x;
        }
    }

    class DoubleLinkedList {
        private ListNode head;
        private ListNode tail;

        DoubleLinkedList() {
            this.head = new ListNode(0);
            this.tail = new ListNode(0);
            this.head.next = tail;
            this.tail.prev = head;
        }

        ListNode addNode(int x) {
            ListNode node = new ListNode(x);
            this.tail.prev.next = node;
            node.prev = this.tail.prev;
            node.next = this.tail;
            this.tail.prev = node;

            return node;
        }

        int getLast() {
            return this.tail.prev.val;
        }

        void removeNode(ListNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    private DoubleLinkedList doubleLinkedList;
    private TreeMap<Integer, List<ListNode>> treeMap;

    MaxStack() {
        this.doubleLinkedList = new DoubleLinkedList();
        this.treeMap = new TreeMap<Integer, List<ListNode>>();
    }

    void push(int x) {

        ListNode node = this.doubleLinkedList.addNode(x);
        if (!this.treeMap.containsKey(x)) {
            this.treeMap.put(x, new ArrayList<ListNode>());
        }
        treeMap.get(x).add(node);
    }

    int peek() {
        return this.doubleLinkedList.getLast();
    }

    int pop() {
        int val = this.peek();
        List<ListNode> list = this.treeMap.get(val);
        ListNode lastNode = list.remove(list.size()-1);
        if (list.size() == 0) {
            this.treeMap.remove(val);
        }
        this.doubleLinkedList.removeNode(lastNode);

        return val;
    }


    int peekMax() {
        return this.treeMap.lastKey();
    }

    int popMax() {
        int max = this.peekMax();
        List<ListNode> list = this.treeMap.get(max);
        ListNode maxNode = list.get(list.size()-1);
        if (list.size() == 0) {
            this.treeMap.remove(max);
        }
        this.doubleLinkedList.removeNode(maxNode);

        return max;
    }
}
