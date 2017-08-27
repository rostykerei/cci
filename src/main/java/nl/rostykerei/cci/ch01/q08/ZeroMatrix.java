package nl.rostykerei.cci.ch01.q08;

/**
 * Question 1.8 - Zero Matrix.
 *
 * @author Rosty Kerei
 */
public interface ZeroMatrix {

    /**
     * Updates input matrix - if an element is 0 then entire row and
     * column of this element is set to 0.
     *
     * @param input input matrix
     */
    void zeroMatrix(int[][] input);
}
