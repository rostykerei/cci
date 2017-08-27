package nl.rostykerei.cci.ch01.q04;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of {@link PalindromePermutation} using a hash-map.
 *
 * @author Rosty Kerei
 */
public final class PalindromePermutationHashMap
        implements PalindromePermutation {

    @Override
    public boolean isPalindromePermutation(final String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (Character c : input.toCharArray()) {
            charCountMap.merge(c, 1, (a, b) -> a + 1);
        }

        boolean oddFound = false;

        for (Character c : charCountMap.keySet()) {
            if (charCountMap.get(c) % 2 != 0) {
                if (oddFound) {
                    return false;
                }

                oddFound = true;
            }
        }

        return true;
    }
}
