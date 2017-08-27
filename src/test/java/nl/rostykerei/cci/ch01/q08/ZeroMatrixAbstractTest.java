package nl.rostykerei.cci.ch01.q08;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public abstract class ZeroMatrixAbstractTest extends AbstractFactoryTest<ZeroMatrix> {

    @Test
    public void zeroMatrix() throws Exception {
        int[][] input = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 0, 4, 5, 6, 0, 8, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 0, 7, 8, 9},
        };

        int[][] expected = {
                {1, 2, 0, 4, 5, 0, 0, 8, 9},
                {1, 2, 0, 4, 5, 0, 0, 8, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 2, 0, 4, 5, 0, 0, 8, 9},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        testInstance.zeroMatrix(input);

        assertTrue(Arrays.deepEquals(expected, input));
    }

}