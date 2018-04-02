package nl.rostykerei.cci.ch05.q06;

/**
 * XOR implementation of {@link Conversion}.
 *
 * @author Rosty Kerei
 */
public class ConversionImpl implements Conversion {

    /**
     * {@inheritDoc}
     */
    @Override
    public int flipBits(final int a, final int b) {
        return Integer.bitCount(a ^ b);
    }
}
