package nl.rostykerei.cci.ch05.q01;

/**
 * Question 5.1 - Insertion.
 *
 * @author Rosty Kerei
 */
public interface Insertion {

    /**
     * Inserts M into N such that M starts at bit j and ends at bit i.
     *
     * @param n 32-bit number to insert in
     * @param m 32-bit number to insert to
     * @param i insertion end position
     * @param j insertion start position
     * @return result of insertion
     */
    int insert(int n, int m, byte i, byte j);
}
