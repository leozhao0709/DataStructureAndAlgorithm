package unionfind;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 7/31/17.
 */
public class UFTest {

    UF uf;

    @Before
    public void setUp() throws Exception {
        this.uf = new UF(9);
        this.uf.union(5, 8);
        this.uf.union(3, 6);
        this.uf.union(3, 8);
        this.uf.union(1, 6);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void isConnected() throws Exception {
        assert this.uf.isConnected(1, 8);
        assert this.uf.isConnected(3, 5);
        assertFalse(this.uf.isConnected(1, 7));
    }

}