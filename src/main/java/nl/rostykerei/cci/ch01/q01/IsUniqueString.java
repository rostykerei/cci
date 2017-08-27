package nl.rostykerei.cci.ch01.q01;


/**
 * Implementation of {@link IsUnique} using a string.
 *
 * @author Rosty Kerei
 */
public final class IsUniqueString implements IsUnique {

    @Override
    public boolean isUniqueCharsOnly(final String input) {
        String checker = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (checker.indexOf(c) > -1) {
                return false;
            }

            checker += c;
        }

        return true;
    }

}
