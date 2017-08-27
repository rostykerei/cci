package nl.rostykerei.cci.ch01.q01;

/**
 * Implementation of {@link IsUnique} using an array.
 *
 * @author Rosty Kerei
 */
public final class IsUniqueArray implements IsUnique {

    /**
     * 255 for ASCII, Character.MAX_VALUE for Unicode.
     */
    private static final int ARRAY_LENGTH = 255;

    @Override
    public boolean isUniqueCharsOnly(final String input) {

        if (input.length() <= ARRAY_LENGTH) {
            boolean[] checker = new boolean[ARRAY_LENGTH + 1];

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (checker[c]) {
                    return false;
                }

                checker[c] = true;
            }

            return true;
        } else {
            return false;
        }
    }

}
