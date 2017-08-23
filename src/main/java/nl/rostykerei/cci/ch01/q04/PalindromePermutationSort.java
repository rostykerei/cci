package nl.rostykerei.cci.ch01.q04;

import java.util.Arrays;

/**
 * Implementation of {@link PalindromePermutation} using a arrays sort function.
 *
 * @author Rosty Kerei
 */
public class PalindromePermutationSort implements PalindromePermutation {

    public boolean isPalindromePermutation(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);

        boolean oddFound = false;
        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                if (count % 2 != 0) {
                    if (oddFound) {
                        return false;
                    }

                    oddFound = true;
                }

                count = 1;
            }
        }

        return true;
    }

}
