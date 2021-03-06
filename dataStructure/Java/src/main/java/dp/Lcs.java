package dp;

/**
 * Created by lzhao on 8/1/17.
 */

class Lcs {

    private String commonString;

    int getLcs(String a, String b) {
        int m = a.length();
        int n = b.length();

        if (m == 0 || n == 0) {
            this.commonString = null;
            return 0;
        }

        this.commonString = "";

        int[][] table = new int[m+1][n+1];


        // 填表
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (a.charAt(i - 1) == b.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                } else {
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i >=1 && j>= 1) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                sb.append(a.charAt(i-1));
                i--;
                j--;
            } else if (table[i][j-1] > table[i-1][j]) {
                j--;
            } else {
                i--;
            }
        }


        this.commonString = sb.reverse().toString();

        return table[m][n];
    }

    String getCommonString() {
        return commonString;
    }
}
