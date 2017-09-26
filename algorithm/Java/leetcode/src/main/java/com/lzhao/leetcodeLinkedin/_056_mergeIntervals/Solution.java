package com.lzhao.leetcodeLinkedin._056_mergeIntervals;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/25/17.
 */

class Solution {
    List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new LinkedList<Interval>();
        if (intervals.size() == 0) {
            return res;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start == o2.start?o1.end - o2.end: o1.start-o2.start;
            }
        });

        res.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++)
        {
            Interval current = intervals.get(i);
            Interval last = res.get(res.size()-1);

            if (last.end < current.start) {
                res.add(current);
            } else if (last.end < current.end) {
                res.set(res.size()-1,new Interval(last.start, current.end));
            }
        }

        return res;
    }
}
