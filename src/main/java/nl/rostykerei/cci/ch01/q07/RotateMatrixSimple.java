package nl.rostykerei.cci.ch01.q07;

/**
 * Implementation of {@link RotateMatrix}.
 *
 * @author Rosty Kerei
 */
public final class RotateMatrixSimple implements RotateMatrix {

    @Override
    public int[][] rotate(final int[][] image) {
        final int n = image.length;

        int[][] result = new int[n][n];

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                result[y][n - 1 - x] = image[x][y];
            }
        }

        return result;
    }
}
