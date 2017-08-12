package nl.rostykerei.cci.ch01.q02;

/**
 * Question 1.2 - Check Permutation
 */
public interface PermutationChecker {

    /**
     * Checks if one string is a permutation of another.
     *
     * @param a first string
     * @param b second string
     * @return <code>true</code> if one string is a permutation of another
     */
    boolean isPermutation(String a, String b);

}
