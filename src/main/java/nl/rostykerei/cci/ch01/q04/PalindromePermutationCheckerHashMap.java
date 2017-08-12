package nl.rostykerei.cci.ch01.q04;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutationCheckerHashMap implements PalindromePermutationChecker {

    public boolean isPalindromePermutation(String input) {
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (Character c : input.toCharArray()) {
            Integer count = charCountMap.get(c);
            charCountMap.put(c, count == null ? 1 : count+1);
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
