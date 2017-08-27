package nl.rostykerei.cci.ch01.q02;

import java.util.Arrays;

/**
 * Implementation of {@link CheckPermutation} using a sorted string.
 *
 * @author Rosty Kerei
 */
public final class CheckPermutationSort implements CheckPermutation {

    @Override
    public boolean checkPermutation(final String a, final String b) {
        return a.length() == b.length() && sortString(a).equals(sortString(b));
    }

    /**
     * Sorts given string.
     *
     * @param s string to sort
     * @return sorted string
     */
    private String sortString(final String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
