package backtracking;

import java.util.Arrays;

/**
 * Created by lzhao on 7/31/17.
 */

class Queens {
    private int queenNumber;
    private int[] cols; //每一列皇后的位置
    private int num; // 放法种类

    Queens(int queenNumber) {
        this.queenNumber = queenNumber;
        this.cols = new int[queenNumber];
        this.num = 0;
    }

    void getMethod() {
        this.getQueenPositionAtCol(0);
    }

    /**
     * 填第n列的皇后
     */
    void getQueenPositionAtCol(int n) {
        boolean[] rows = new boolean[queenNumber];
        Arrays.fill(rows, true);
        // 获取皇后可放置的位置, 从第0列开始遍历
        for (int i = 0; i < n; i++)
        {
            //cols[i]是第i列皇后的位置
            rows[cols[i]] = false;

            //正斜对角不能放
            if (cols[i]-n + i >=0 && cols[i]-n + i < queenNumber) {
                rows[cols[i]-n + i] = false;
            }

            //反斜对角不能放
            if (n-i + cols[i] >= 0 && n-i + cols[i] < queenNumber) {
                rows[n-i + cols[i]] = false;
            }
        }
        
        // 开始放皇后
        for (int i = 0; i < queenNumber; i++)
        {
            if (rows[i]) {
                cols[n] = i;
                if (n < queenNumber - 1) {
                    getQueenPositionAtCol(n+1);
                } else {
                    this.num ++;
                    System.out.println("第" + this.num + "种: ");
                    printQueen();
                    System.out.println();
                }
            }
        }
    }

    private void printQueen() {
        for (int i = 0; i < queenNumber; i++)
        {
            for (int j = 0; j < queenNumber; j++)
            {
                if (j == cols[i]) {
                    System.out.print("0 ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

}
