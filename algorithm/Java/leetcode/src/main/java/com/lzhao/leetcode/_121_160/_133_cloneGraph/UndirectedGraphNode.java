package com.lzhao.leetcode._121_160._133_cloneGraph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 8/25/17.
 */

class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
}
