package nl.rostykerei.cci.ch01.q02;

/**
 * Implementation of {@link CheckPermutation} using an array.
 *
 * @author Rosty Kerei
 */
public class CheckPermutationArray implements CheckPermutation {

    @Override
    public boolean checkPermutation(String a, String b) {
        int l = a.length();

        if (l == b.length()) {

            int[] charMap = new int[255]; // 255 for ASCII, Character.MAX_VALUE for Unicode

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