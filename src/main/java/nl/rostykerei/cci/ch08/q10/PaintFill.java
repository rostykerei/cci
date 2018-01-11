package nl.rostykerei.cci.ch08.q10;

/**
 * Question 8.10 - Paint Fill.
 *
 * @author Rosty Kerei
 */
public interface PaintFill {

    /**
     * Fills the surrounding area with the given color.
     *
     * @param screen 2-dimensional array of colors
     * @param row row to start filling
     * @param col column to start filling
     * @param color color to fill
     */
    void paintFill(int[][] screen, int row, int col, int color);

}
