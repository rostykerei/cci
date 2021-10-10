package nl.rostykerei.cci.ch01.q08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link ZeroMatrix}.
 *
 * @author Rosty Kerei
 */
public final class ZeroMatrixImpl implements ZeroMatrix {

    @Override
    public void zeroMatrix(final int[][] input) {

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
            Arrays.fill(input[row], 0);
        }

        for (int col : zeroCols) {
            for (int row = 0; row < input.length; row++) {
                input[row][col] = 0;
            }
        }
    }

}
