package nl.rostykerei.cci.ch01.q07;

/**
 * Transpose and reverse implementation of {@link RotateMatrix}.
 *
 * @author Rosty Kerei
 */
public final class RotateMatrixTranspose implements RotateMatrix {

    @Override
    public int[][] rotate(final int[][] image) {
        final int n = image.length;

        // Matrix transpose
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                int temp = image[row][col];
                image[row][col] = image[col][row];
                image[col][row] = temp;
            }
        }

        // Reverse
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n / 2; col++) {
                int temp = image[row][col];
                image[row][col] = image[row][n - col - 1];
                image[row][n - col - 1] = temp;
            }
        }

        return image;
    }
}
