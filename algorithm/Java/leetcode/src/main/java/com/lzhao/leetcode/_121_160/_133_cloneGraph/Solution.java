package com.lzhao.leetcode._121_160._133_cloneGraph;

import java.util.*;

/**
 * Created by lzhao on 8/25/17.
 */

class Solution {

    UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        UndirectedGraphNode root = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();

        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        map.put(node, root);
        queue.offer(node);

        while (!queue.isEmpty()) {
            UndirectedGraphNode curr = queue.poll();

            for(UndirectedGraphNode neighbor: curr.neighbors) {
                if (!map.containsKey(neighbor)) {
                    queue.offer(neighbor);
                    map.put(neighbor, new UndirectedGraphNode(neighbor.label));
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }

        }

        return root;
    }

}
