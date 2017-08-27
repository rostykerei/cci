package nl.rostykerei.cci.ch01.q02;

/**
 * Implementation of {@link CheckPermutation} using an array.
 *
 * @author Rosty Kerei
 */
public final class CheckPermutationArray implements CheckPermutation {

    /**
     * 255 for ASCII, Character.MAX_VALUE for Unicode.
     */
    private static final int ARRAY_LENGTH = 255;

    @Override
    public boolean checkPermutation(final String a, final String b) {
        int l = a.length();

        if (l == b.length()) {

            int[] charMap = new int[ARRAY_LENGTH];

            for (int i = 0; i < l; i++) {
                charMap[a.charAt(i)]++;
            }

            for (int i = 0; i < l; i++) {
                if (--charMap[b.charAt(i)] < 0) {
                    return false;
                }
            }

            return true;

        } else {
            return false;
        }
    }
}
