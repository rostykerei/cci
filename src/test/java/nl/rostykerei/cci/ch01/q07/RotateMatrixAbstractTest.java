package nl.rostykerei.cci.ch01.q07;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public abstract class RotateMatrixAbstractTest extends AbstractFactoryTest<RotateMatrix> {

    @Test
    public void rotate1() throws Exception {
        int[][] input = {{1}};

        int[][] expected = {{1}};

        int[][] output = testInstance.rotate(input);

        assertTrue(Arrays.deepEquals(expected, output));
    }

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

        int[][] output = testInstance.rotate(input);

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

        int[][] output = testInstance.rotate(input);

        assertTrue(Arrays.deepEquals(expected, output));
    }

    @Test
    public void rotate4() throws Exception {
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] expected = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };

        int[][] output = testInstance.rotate(input);

        assertTrue(Arrays.deepEquals(expected, output));
    }

}