package recursion;

/**
 * Created by lzhao on 7/26/17.
 */

class Gcd {
    int calGcd(int m, int n) {
        if (m > n) {
            if (n == 0) {
                return m;
            }
            return calGcd(n, m%n);
        } else {
            if (m == 0) {
                return n;
            }
            return calGcd(m, n%m);
        }
    }
}
