package nl.rostykerei.cci.ch01.q02;

import java.util.Arrays;

/**
 * Implementation of {@link PermutationChecker} using a sorted string.
 *
 * @author Rosty Kerei
 */
public class PermutationCheckerSort implements PermutationChecker {

    @Override
    public boolean isPermutation(String a, String b) {
        return a.length() == b.length() && sortString(a).equals(sortString(b));
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
