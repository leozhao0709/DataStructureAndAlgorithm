package com.lzhao.leetcode._041_080._056_mergeIntervals;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/14/17.
 */

class Solution {

    private List<Interval> result = new LinkedList<Interval>();

    List<Interval> merge(List<Interval> intervals) {

        if (intervals.size() == 0) {
            return result;
        }

        Comparator<Interval> comparator = new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start == o2.start?o1.end-o2.end:o1.start-o2.start;
            }
        };

        Collections.sort(intervals, comparator);

        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval lastResult = result.get(result.size()-1);

            if (lastResult.end >= intervals.get(i).start && lastResult.end <= intervals.get(i).end) {
                lastResult = new Interval(lastResult.start, intervals.get(i).end);
                result.set(result.size()-1, lastResult);
            } else if (lastResult.end < intervals.get(i).start) {
                result.add(intervals.get(i));
            }
        }


        return result;
    }




}
