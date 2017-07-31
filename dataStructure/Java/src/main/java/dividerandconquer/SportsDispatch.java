package dividerandconquer;

/**
 * Created by lzhao on 7/30/17.
 */

class SportsDispatch {

    int[][] scheduleTable(int n) {
        int[][] table = new int[n][n];

        dispatchTable(table, n);

        return table;
    }

    private void dispatchTable(int[][] table, int n) {
        if (n == 1) {
            table[0][0] = 1;
        } else {

            int m = n / 2;

            // left top
            dispatchTable(table, m);

            // left bottom
            for (int i = m; i < n ; i++) {
                for (int j = 0; j < m; j++) {
                    table[i][j] = table[i-m][j] + m;
                }
            }

            // right top
            for (int i = 0; i < m; i++) {
                for (int j = m; j < n; j++) {
                    table[i][j] = table[i][j-m] + m;
                }
            }
            
            // right bottom
            for (int i = m; i < n; i++) {
                for (int j = m; j < n; j++) {
                    table[i][j] = table[i-m][j-m];
                }
            }
        }
    }
}
