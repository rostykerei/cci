package nl.rostykerei.cci.ch08.q10;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public abstract class PaintFillAbstractTest extends AbstractFactoryTest<PaintFill> {


    @Test
    public void testFill() {
        int[][] screen = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0},
        };

        int[][] expected = {
                {2, 2, 1, 0, 0},
                {2, 2, 1, 0, 0},
                {2, 2, 1, 1, 1},
                {2, 2, 2, 2, 2},
        };

        testInstance.paintFill(screen, 1, 1, 2);

        assertArrayEquals(expected, screen);
    }
}