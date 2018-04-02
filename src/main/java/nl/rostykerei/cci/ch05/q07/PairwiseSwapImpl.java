package nl.rostykerei.cci.ch05.q07;

/**
 * Implementation of {@link PairwiseSwap}. Shifts all even bits right,
 * all odd bits left and then ORs both results.
 *
 * @author Rosty Kerei
 */
public class PairwiseSwapImpl implements PairwiseSwap {

    /**
     * Even bits mask (32-bits).
     */
    private static final int EVEN_MASK = 0b10101010101010101010101010101010;

    /**
     * Odd bits mask (32-bits).
     */
    private static final int ODD_MASK = 0b01010101010101010101010101010101;

    /**
     * {@inheritDoc}
     */
    @Override
    public int swapBits(final int x) {
        int evenBits = x & EVEN_MASK;
        int oddBits = x & ODD_MASK;

        return evenBits >> 1 | oddBits << 1;
    }
}
