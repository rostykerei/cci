package nl.rostykerei.cci.ch01.q01;

/**
 * Implementation of {@link UniqueCharsChecker} using an array.
 *
 * @author Rosty Kerei
 */
public class UniqueCharsCheckerArray implements UniqueCharsChecker {

    @Override
    public boolean isUniqueCharsOnly(String input) {
        int ARRAY_LENGTH = 255; // 255 for ASCII, Character.MAX_VALUE for Unicode

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
