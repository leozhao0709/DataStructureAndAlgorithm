package dividerandconquer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lzhao on 7/30/17.
 */
public class SportsDispatchTest {

    SportsDispatch sportsDispatch;

    @Before
    public void setUp() throws Exception {
        this.sportsDispatch = new SportsDispatch();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void dispatch() throws Exception {
        int n = 20;
        int[][] table = this.sportsDispatch.scheduleTable(n);
        for(int[] row: table) {
            for(int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}