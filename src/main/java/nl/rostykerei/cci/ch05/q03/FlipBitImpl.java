package nl.rostykerei.cci.ch05.q03;

/**
 * Implementation of {@link FlipBit}.
 *
 * @author Rosty Kerei
 */
public class FlipBitImpl implements FlipBit {

    /**
     * {@inheritDoc}
     */
    @Override
    public int flipBit(final int input) {
        int result = 0;

        // Flips bit to 1, get max 1s count and save max(result)
        for (int i = 0; i < Integer.SIZE; i++) {
            result = Math.max(maxOnes(input | (1 << i)), result);
        }

        return result;
    }

    /**
     * Ands x with x << 1 until it becomes 0.
     * The number of needed iterations is actually the length
     * of the longest consecutive sequence of 1s.
     *
     * @param input input integer
     * @return the longest consecutive sequence of 1s
     */
    private int maxOnes(final int input) {
        int count = 0;
        int x = input;

        while (x != 0) {
            x = (x & (x << 1));
            count++;
        }

        return count;
    }
}
