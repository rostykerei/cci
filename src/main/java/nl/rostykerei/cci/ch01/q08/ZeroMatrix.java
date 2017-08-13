package nl.rostykerei.cci.ch01.q08;

import java.util.HashSet;
import java.util.Set;

/**
 * Question 1.8 - Zero Matrix.
 *
 * @author Rosty Kerei
 */
public class ZeroMatrix {

    /**
     * Updates input matrix - if an element is 0 then entire row and column of this element is set to 0.
     *
     * @param input input matrix
     */
    public static void zeroMatrix(int[][] input) {

        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int row = 0; row < input.length; row++) {
            for (int col = 0; col < input[row].length; col++) {
                if (input[row][col] == 0) {
                    zeroRows.add(row);
                    zeroCols.add(col);
                }
            }
        }

        for (int row : zeroRows) {
            for (int col = 0; col < input[row].length; col++) {
                input[row][col] = 0;
            }
        }

        for (int col : zeroCols) {
            for (int row = 0; row < input.length; row++) {
                input[row][col] = 0;
            }
        }
    }

}
