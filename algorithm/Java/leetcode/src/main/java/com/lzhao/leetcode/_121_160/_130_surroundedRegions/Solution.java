package com.lzhao.leetcode._121_160._130_surroundedRegions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lzhao on 8/24/17.
 */

class Solution {
    void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        Queue<Point> queue = new LinkedList<Point>();
        
        // top
        for (int i = 0; i < cols; i++)
        {
            if (board[0][i] == 'O') {
                queue.offer(new Point(0, i));
                board[0][i] = 'Y';
            }
        }

        // bottom
        if (rows > 1) {
            for (int i = 0; i < cols; i++)
            {
                if (board[rows-1][i] == 'O') {
                    queue.offer(new Point(rows-1, i));
                    board[rows-1][i] = 'Y';
                }
            }
        }

        // left
        for (int i = 0; i < rows; i++)
        {
            if (board[i][0] == 'O') {
                queue.offer(new Point(i, 0));
                board[i][0] = 'Y';
            }
        }

        // right
        if (cols > 1) {
            for (int i = 0; i < rows; i++)
            {
                if (board[i][cols-1] == 'O') {
                    queue.offer(new Point(i, cols-1));
                    board[i][cols-1] = 'Y';
                }
            }
        }

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            int x = current.getX();
            int y = current.getY();

            // go down
            if (x + 1 < rows && board[x+1][y] == 'O') {
                queue.offer(new Point(x+1, y));
                board[x+1][y] = 'Y';
            }

            // go up
            if (x-1 > 0 && board[x-1][y] == 'O') {
                queue.offer(new Point(x-1, y));
                board[x-1][y] = 'Y';
            }

            // go right
            if (y+1 < cols && board[x][y+1] == 'O') {
                queue.offer(new Point(x, y+1));
                board[x][y+1] = 'Y';
            }

            // go left
            if (y-1 > 0 && board[x][y-1] == 'O') {
                queue.offer(new Point(x, y-1));
                board[x][y-1] = 'Y';
            }
        }

        // flip
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
               if (board[i][j] == 'Y') {
                   board[i][j] = 'O';
               }
               else if (board[i][j] == 'O') {
                   board[i][j] = 'X';
               }
            }
        }
    }
}
