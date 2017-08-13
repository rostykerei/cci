package nl.rostykerei.cci.ch01.q09;

/**
 * Question 1.9 - String Rotation.
 *
 * @author Rosty Kerei
 */
public class StringRotation {

    /**
     * Checks if the String s2 is a rotation of s1.
     *
     * @param s1 base string
     * @param s2 rotation string
     * @return <code>true</code> if <code>s2</code> is a rotation of <code>s1</code>
     */
    public static boolean isStringRotation(String s1, String s2) {
        return s2.length() == s1.length() && isSubstring(s2 + s2, s1);
    }

    private static boolean isSubstring(String base, String substring) {
        return base.contains(substring);
    }
}
