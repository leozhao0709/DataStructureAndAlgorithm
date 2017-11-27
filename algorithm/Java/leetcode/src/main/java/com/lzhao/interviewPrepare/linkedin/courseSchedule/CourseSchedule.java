package com.lzhao.interviewPrepare.linkedin.courseSchedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lzhao on 11/27/17.
 */

class CourseSchedule {

    int[] findOrder(int numCourses, int[][] prerequisites) {

        List[] graph = new List[numCourses];
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++)
        {
            graph[i]= new ArrayList<Integer>();
        }

        for(int[] prerequist: prerequisites) {
            graph[prerequist[1]].add(prerequist[0]);
            indegree[prerequist[0]]++;
        }

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < numCourses; i++)
        {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] res = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            res[index++] = curr;
            List<Integer> vertex = graph[curr];

            for (int temp: vertex) {
                indegree[temp]--;
                if (indegree[temp] == 0) {
                    queue.offer(temp);
                }
            }
        }

        return index < numCourses?new int[0]: res;
    }
}
