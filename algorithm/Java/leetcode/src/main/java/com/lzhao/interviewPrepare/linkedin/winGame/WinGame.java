package com.lzhao.interviewPrepare.linkedin.winGame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 11/30/17.
 */

class WinGame {

//    /**
//     * TLE
//     * @param maxChoosableInteger
//     * @param desiredTotal
//     * @return true or false
//     */
//
//    boolean canIWin(int maxChoosableInteger, int desiredTotal) {
//        if ((1+maxChoosableInteger)*maxChoosableInteger/2 < desiredTotal) {
//            return false;
//        }
//
//
//        boolean[] visited = new boolean[maxChoosableInteger+1];
//        return this.helper(0, maxChoosableInteger, desiredTotal, visited);
//    }
//
//    private boolean helper(int cur, int end, int total, boolean[] visited) {
//
//        for (int i = 1; i <= end ; i++)
//        {
//            if (!visited[i]) {
//                visited[i] = true;
//                if (cur + i >= total || !this.helper(cur+i, end, total, visited)) {
//                    visited[i] = false;
//                    return true;
//                }
//                visited[i] = false;
//            }
//        }
//        return false;
//    }

    boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if ((1+maxChoosableInteger)*maxChoosableInteger/2 < desiredTotal) {
            return false;
        }

        int[] status = new int[maxChoosableInteger+1];
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        return this.canIWin(maxChoosableInteger, desiredTotal, status, map);
    }

    private boolean canIWin(int maxChoosableInteger, int desiredTotal, int[] status, Map<String, Boolean> map) {
        String key = Arrays.toString(status);
        if (map.containsKey(key)) {
            return map.get(key);
        }

        for (int i = 1; i <= maxChoosableInteger; i++)
        {
            if (status[i] == 0) {
                status[i] = 1;
                if (i >= desiredTotal || !this.canIWin(maxChoosableInteger, desiredTotal-i, status, map)) {
                    status[i] = 0;
                    map.put(key, true);
                    return true;
                }
                status[i] = 0;
            }
        }
        map.put(key, false);
        return false;
    }
}
