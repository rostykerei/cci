package nl.rostykerei.cci.ch01.q02;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of {@link PermutationChecker} using an hash-map.
 *
 * @author Rosty Kerei
 */
public class PermutationCheckerHashMap implements PermutationChecker {

    @Override
    public boolean isPermutation(String a, String b) {
        int l = a.length();

        if (l == b.length()) {
            Map<Character, Integer> charMapA = new HashMap<Character, Integer>();
            Map<Character, Integer> charMapB = new HashMap<Character, Integer>();

            for (int i = 0; i < l; i++) {
                Character charA = a.charAt(i);
                Character charB = b.charAt(i);

                Integer countCharA = charMapA.get(charA);
                Integer countCharB = charMapB.get(charB);

                charMapA.put(charA, countCharA == null ? 1 : countCharA + 1);
                charMapB.put(charB, countCharB == null ? 1 : countCharB + 1);
            }

            return charMapA.equals(charMapB);

        } else {
            return false;
        }
    }
}
