package nl.rostykerei.cci.ch05.q01;

/**
 * Implementation of {@link Insertion}.
 *
 * @author Rosty Kerei
 */
public class InsertionImpl implements Insertion {

    /**
     * {@inheritDoc}
     */
    @Override
    public int insert(final int n, final int m, final byte i, final byte j) {
        return (n & ((~0 << (j + 1)) | ((1 << i) - 1))) | (m << i);
    }
}
