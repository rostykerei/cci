package nl.rostykerei.cci.ch01.q02;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of {@link CheckPermutation} using an hash-map.
 *
 * @author Rosty Kerei
 */
public final class CheckPermutationHashMap implements CheckPermutation {

    @Override
    public boolean checkPermutation(final String a, final String b) {
        int l = a.length();

        if (l == b.length()) {
            Map<Character, Integer> charMapA = new HashMap<>();
            Map<Character, Integer> charMapB = new HashMap<>();

            for (int i = 0; i < l; i++) {
                charMapA.merge(a.charAt(i), 1, (x, y) -> x + 1);
                charMapB.merge(b.charAt(i), 1, (x, y) -> x + 1);
            }

            return charMapA.equals(charMapB);
        } else {
            return false;
        }
    }
}
