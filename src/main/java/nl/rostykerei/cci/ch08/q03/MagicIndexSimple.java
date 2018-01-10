package nl.rostykerei.cci.ch08.q03;

/**
 * Simplest implementation of {@link MagicIndex}.
 *
 * @author Rosty Kerei
 */
public final class MagicIndexSimple implements MagicIndex {

    @Override
    public Integer findMagicIndex(final int[] input) {

        for (int i = 0; i < input.length; i++) {
            if (i == input[i]) {
                return i;
            }
        }

        return null;
    }
}
