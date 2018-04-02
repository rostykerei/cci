package nl.rostykerei.cci.ch05.q05;

/**
 * Question 5.3 - Debugger.
 *
 * @author Rosty Kerei
 */
public interface Debugger {

    /**
     * Performs ((n &amp; (n - 1)) == 0) check.
     *
     * @param n input integer
     * @return if n is 0 or a power of 2
     */
    boolean isZeroOrPowerOfTwo(int n);
}
