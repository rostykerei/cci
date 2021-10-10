package nl.rostykerei.cci.ch08.q10;

/**
 * Recursive implementation of {@link PaintFill}.
 *
 * @author Rosty Kerei
 */
public final class PaintFillImpl implements PaintFill {

    @Override
    public void paintFill(final int[][] screen,
                          final int row, final int col,
                          final int color) {

        fill(screen, row, col, screen[row][col], color);
    }

    /**
     * Recursive array filler.
     *
     * @param screen   input 2-dimensional array
     * @param row      row to start
     * @param col      column to start
     * @param oldColor old color of the cell
     * @param newColor new color
     */
    private void fill(final int[][] screen,
                      final int row, final int col,
                      final int oldColor, final int newColor) {
        if (row >= 0 && row <= screen.length - 1
                && col >= 0 && col <= screen[row].length - 1
                && screen[row][col] == oldColor) {

            screen[row][col] = newColor;

            fill(screen, row - 1, col, oldColor, newColor);
            fill(screen, row, col + 1, oldColor, newColor);
            fill(screen, row + 1, col, oldColor, newColor);
            fill(screen, row, col - 1, oldColor, newColor);
        }
    }
}

