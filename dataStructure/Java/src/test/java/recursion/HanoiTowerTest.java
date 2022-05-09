package recursion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 7/27/17.
 */
public class HanoiTowerTest {

    HanoiTower hanoiTower;

    @Before
    public void setUp() throws Exception {
        this.hanoiTower = new HanoiTower();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void move() throws Exception {
        this.hanoiTower.move(4, 'A', 'B', 'C');
    }

}