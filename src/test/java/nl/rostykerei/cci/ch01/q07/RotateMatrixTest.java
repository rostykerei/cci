package nl.rostykerei.cci.ch01.q07;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class RotateMatrixTest {

    @Test
    public void rotate2() throws Exception {
        int[][] input = {
                {1, 2},
                {3, 4}
        };

        int[][] expected = {
                {3, 1},
                {4, 2}
        };

        int[][] output = RotateMatrix.rotate(input);

        assertTrue(Arrays.deepEquals(expected, output));
    }

    @Test
    public void rotate3() throws Exception {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        int[][] output = RotateMatrix.rotate(input);

        assertTrue(Arrays.deepEquals(expected, output));
    }

}