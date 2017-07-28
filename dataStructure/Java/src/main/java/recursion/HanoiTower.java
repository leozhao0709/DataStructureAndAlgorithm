package recursion;

/**
 * Created by lzhao on 7/27/17.
 */

class HanoiTower {
    private int i;

    void move(int n, char from, char depend, char to) {

        if (n == 0) {
            return;
        }
        move(n - 1, from, to, depend);
        move(n, from, to);
        move(n-1, depend, from, to);
    }

    private void move(int n, char from, char to) {
        System.out.println("step " + ++i + ": 第" + n +"个盘子从" + from + "移动到" + to + ";");
    }
}
