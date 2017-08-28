package nl.rostykerei.cci.ch01.q07;

/**
 * Another implementation of {@link RotateMatrix}.
 *
 * @author Rosty Kerei
 */
public final class RotateMatrixRoll implements RotateMatrix {

    @Override
    public int[][] rotate(final int[][] image) {
        final int n = image.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = image[i][j];

                image[i][j] = image[n - 1 - j][i];
                image[n - 1 - j][i] = image[n - 1 - i][n - 1 - j];
                image[n - 1 - i][n - 1 - j] = image[j][n - 1 - i];
                image[j][n - 1 - i] = temp;
            }
        }

        return image;
    }
}
