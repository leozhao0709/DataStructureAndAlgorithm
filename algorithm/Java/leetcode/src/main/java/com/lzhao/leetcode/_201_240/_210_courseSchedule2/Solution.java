package com.lzhao.leetcode._201_240._210_courseSchedule2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lzhao on 9/10/17.
 */

class Solution {

    int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> res = new LinkedList<Integer>();
        ArrayList[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++)
        {
            graph[i] = new ArrayList<Integer>();
        }

        for (int[] prerequisite : prerequisites)
        {
            graph[prerequisite[1]].add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < numCourses; i++)
        {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            res.add(curr);
            ArrayList<Integer> list = graph[curr];

            for(int course: list) {
                indegree[course]--;

                if (indegree[course] == 0) {
                    queue.offer(course);
                }
            }
        }

        if (res.size() < numCourses) {
            return new int[0];
        } else {
            int[] result = new int[res.size()];
            for (int i = 0; i < res.size(); i++)
            {
                result[i] = res.get(i);
            }

            return result;
        }
    }
}
