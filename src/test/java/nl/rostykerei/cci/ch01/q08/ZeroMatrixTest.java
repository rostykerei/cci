package nl.rostykerei.cci.ch01.q08;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ZeroMatrixTest {

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

        ZeroMatrix.zeroMatrix(input);

        assertTrue(Arrays.deepEquals(expected, input));
    }

}