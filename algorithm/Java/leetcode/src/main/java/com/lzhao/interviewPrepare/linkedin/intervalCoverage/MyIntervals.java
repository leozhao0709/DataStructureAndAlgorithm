package com.lzhao.interviewPrepare.linkedin.intervalCoverage;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 12/3/17.
 */

class MyIntervals {

    static class Interval {
        int start;
        int end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private List<Interval> list = new LinkedList<Interval>();

    void addInterval(int start, int end) {
        Interval interval = new Interval(start, end);
        this.list.add(interval);
    }

    int getTotalCoveredLength() {
        Collections.sort(this.list, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start == o2.start? o1.end - o2.end: o1.start - o2.start;
            }
        });

        int length = 0;
        Interval prev = new Interval(0, 0);

        for (Interval l: this.list) {
            if (l.start >= prev.end) {
                length += l.end - l.start;
                prev = l;
            } else if (l.end > prev.end) {
                length = l.end - prev.start;
                prev = l;
            }
        }

        return length;
    }
}
