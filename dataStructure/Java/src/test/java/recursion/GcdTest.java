package recursion;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 7/26/17.
 */
public class GcdTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void calGcd() throws Exception {
        Gcd gcd = new Gcd();

        int result = gcd.calGcd(99, 33);

        Assert.assertEquals(33, result);

        result = gcd.calGcd(9, 5);
        Assert.assertEquals(1, result);
    }

}