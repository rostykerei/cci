package nl.rostykerei.cci.ch01.q03;

/**
 * Implementation of {@link URLify}.
 *
 * @author Rosty Kerei
 */
public final class URLifyImpl implements URLify {

    /**
     * Space to replace.
     */
    private static final char SPACE = ' ';

    /**
     * Symbols to replace with.
     */
    private static final char[] REPLACEMENT = {'%', '2', '0'};

    @Override
    public char[] replaceSpaces(final char[] input, final int trueLength) {
        char[] output = new char[input.length];

        int k = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == trueLength) {
                break;
            }

            if (input[i] == SPACE) {
                System.arraycopy(REPLACEMENT, 0, output, k, REPLACEMENT.length);
                k = k + REPLACEMENT.length;
            } else {
                output[k] = input[i];
                k++;
            }
        }

        return output;
    }

}
