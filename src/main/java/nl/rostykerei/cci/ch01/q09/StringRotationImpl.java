package nl.rostykerei.cci.ch01.q09;

/**
 * Implementation of {@link StringRotation}.
 *
 * @author Rosty Kerei
 */
public final class StringRotationImpl implements StringRotation {

    @Override
    public boolean isStringRotation(final String s1, final String s2) {
        return s2.length() == s1.length() && isSubstring(s2 + s2, s1);
    }

    /**
     * Checks if string substrings base string.
     *
     * @param base base string
     * @param substring substring
     * @return true if the substring is a substring of the base
     */
    private static boolean isSubstring(final String base,
                                       final String substring) {
        return base.contains(substring);
    }
}
