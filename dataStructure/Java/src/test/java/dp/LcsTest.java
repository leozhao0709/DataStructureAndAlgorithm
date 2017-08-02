package dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/1/17.
 */
public class LcsTest {

    private Lcs lcs;

    @Before
    public void setUp() throws Exception {
        this.lcs = new Lcs();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getLcs() throws Exception {
        // arit or aoit
        String a = "androidStudio";
        String b = "algorithm";

        int length = this.lcs.getLcs(a, b);
        System.out.println("lcs is " + this.lcs.getCommonString() + ", and length is " + length + ";");

    }

}