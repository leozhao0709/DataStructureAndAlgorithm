package com.lzhao.leetcodeAmazon._138_copyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 10/9/17.
 */

class Solution {

    RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }

        RandomListNode headCopy = new RandomListNode(head.label);

        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

        RandomListNode p = head;
        RandomListNode q = headCopy;
        while (p != null) {
            if (p.next != null && !map.containsKey(p.next)) {
                map.put(p.next, new RandomListNode(p.next.label));
            }

            if (p.random != null && !map.containsKey(p.random)) {
                map.put(p.random, new RandomListNode(p.random.label));
            }

            q.next = map.get(p.next);
            q.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }

        return headCopy;
    }
}
