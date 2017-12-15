package com.lzhao.interviewPrepare.linkedin.maxPointsOnLine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 11/27/17.
 */

class MaxPointsOnLine {

    static class  Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int maxPoints(Point[] points) {
        if (points.length < 2) {
            return points.length;
        }

        int res = 0;

        for (int i = 0; i < points.length; i++)
        {
            Point curr = points[i];
            Map<String, Integer> map = new HashMap<String, Integer>();
            int currSamePointCount = 1;
            int maxLocal = 0;
            for (int j = i+1; j < points.length; j++)
            {
                if (points[j].x == curr.x && points[j].y == curr.y) {
                    currSamePointCount++;
                } else {
                    String slope = this.getSlope(points[j], curr);

                    if (map.containsKey(slope)) {
                        map.put(slope, map.get(slope)+1);
                    } else {
                        map.put(slope, 1);
                    }

                    maxLocal = Math.max(maxLocal, map.get(slope));
                }
            }
            res = Math.max(res, currSamePointCount + maxLocal);
        }

        return res;
    }

    private String getSlope(Point point1, Point point2) {

        int diffY = point2.y - point1.y;
        int diffX = point2.x - point1.x;

        String sign = this.getSign(diffX, diffY);

        int gcd = this.getGCD(Math.abs(diffX), Math.abs(diffY));

        return sign+Math.abs(diffY)/gcd+"/"+Math.abs(diffX)/gcd;
    }

    private int getGCD(int a, int b) {
        if (a < b) {
            return this.getGCD(b, a);
        }

        return b == 0? a:this.getGCD(b, a%b);
    }

    private String getSign(int diffX, int diffY) {
        if (diffX >= 0 && diffY<=0 || diffX<=0 && diffY>=0) {
            return "-";
        } else {
            return "+";
        }
    }
}
