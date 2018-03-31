package nl.rostykerei.cci.ch05.q01;

import java.util.BitSet;

/**
 * A silly implementation of {@link Insertion} using {@link BitSet}.
 *
 * @author Rosty Kerei
 */
public class InsertionBitSetImpl implements Insertion {

    /**
     * {@inheritDoc}
     */
    @Override
    public int insert(final int n, final int m, final byte i, final byte j) {
        BitSet nBits = BitSet.valueOf(new long[]{n});
        BitSet mBits = BitSet.valueOf(new long[]{m});

        for (byte k = i; k <= j; k++) {
            nBits.set(k, mBits.get(k - i));
        }

        return (int) nBits.toLongArray()[0];
    }
}
