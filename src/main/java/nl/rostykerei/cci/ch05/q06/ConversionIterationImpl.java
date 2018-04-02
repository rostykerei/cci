package nl.rostykerei.cci.ch05.q06;

/**
 * Another implementation of {@link Conversion}. First a XOR b then
 * iterate result with right shift until it becomes 0.
 * Count increments in shifted number ANDs with 1.
 *
 * @author Rosty Kerei
 */
public class ConversionIterationImpl implements Conversion {

    /**
     * {@inheritDoc}
     */
    @Override
    public int flipBits(final int a, final int b) {
        int count = 0;
        int x = a ^ b;

        while (x > 0) {
            x = x >> 1;
            count += x & 1;
        }

        return count;
    }
}
