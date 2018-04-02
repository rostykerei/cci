package nl.rostykerei.cci.ch05.q06;

/**
 * Question 5.6 - Conversion.
 *
 * @author Rosty Kerei
 */
public interface Conversion {

    /**
     * Returns the number of bits required to flip
     * to convert integer A to integer B.
     *
     * @param a integer A
     * @param b integer B
     * @return number of bits required to flip to convert A to B
     */
    int flipBits(int a, int b);
}
