package com.lzhao.leetcode._201_240._207_courseSchedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lzhao on 9/9/17.
 */

class Solution {

    boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList();
        }

        for (int[] prerequisite : prerequisites) {
            graph[prerequisite[1]].add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            count++;

            ArrayList<Integer> list = graph[cur];
            for(Integer vertex: list) {
                indegree[vertex]--;
                if (indegree[vertex] == 0) {
                    queue.offer(vertex);
                }
            }
        }

        return count==numCourses;
    }
}
