package backtracking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 7/31/17.
 */
public class QueensTest {

    private Queens queens;

    @Before
    public void setUp() throws Exception {
        int n = 8;
        this.queens = new Queens(n);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getMethod() throws Exception {
        this.queens.getMethod();
    }

}