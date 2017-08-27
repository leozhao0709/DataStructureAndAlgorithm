package com.lzhao.leetcode._121_160._138_copyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 8/26/17.
 */

class Solution {

    RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }

        RandomListNode copyHead = new RandomListNode(head.label);

        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        map.put(head, copyHead);

        RandomListNode p = head;

        while (p != null) {
            if (p.next != null && !map.containsKey(p.next)) {
                map.put(p.next, new RandomListNode(p.next.label));
            }

            if (p.random != null && !map.containsKey(p.random)) {
                map.put(p.random, new RandomListNode(p.random.label));
            }

            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);
            p = p.next;
        }

        return copyHead;
    }
}
