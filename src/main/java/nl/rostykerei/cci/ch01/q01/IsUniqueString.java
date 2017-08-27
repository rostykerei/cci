package nl.rostykerei.cci.ch01.q01;


/**
 * Implementation of {@link IsUnique} using a string.
 *
 * @author Rosty Kerei
 */
public final class IsUniqueString implements IsUnique {

    @Override
    public boolean isUniqueCharsOnly(final String input) {
        StringBuilder checker = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (checker.indexOf(String.valueOf(c)) > -1) {
                return false;
            }

            checker.append(c);
        }

        return true;
    }

}
