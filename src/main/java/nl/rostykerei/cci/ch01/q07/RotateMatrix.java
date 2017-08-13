package nl.rostykerei.cci.ch01.q07;

/**
 * Question 1.6 - Rotate Matrix.
 *
 * @author Rosty Kerei
 */
public class RotateMatrix {

    /**
     * Rotates given matrix by 90 degree clockwise.
     *
     * @param image input matrix
     * @return rotated matrix
     */
    public static int[][] rotate(int[][] image) {
        int n = image.length;

        // TODO: its possible to do it in O(N) memory
        int[][] result = new int[n][n];

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                result[y][n - 1 - x] = image[x][y];
            }
        }

        return result;
    }
}
