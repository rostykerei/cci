package nl.rostykerei.cci.ch01.q04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class PalindromePermutationAbstractTest<T extends PalindromePermutation> {

    private T checker;

    protected abstract T createChecker();

    @Before
    public void setUp() {
        checker = createChecker();
    }

    @Test
    public void testTrue() throws Exception {
        assertTrue(checker.isPalindromePermutation("abcxcba"));
        assertTrue(checker.isPalindromePermutation("tacocat"));
        assertTrue(checker.isPalindromePermutation("xxxyyyxxx"));
        assertTrue(checker.isPalindromePermutation("aabxb"));
        assertTrue(checker.isPalindromePermutation("a"));
        assertTrue(checker.isPalindromePermutation("xx"));
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(checker.isPalindromePermutation("axxb"));
        assertFalse(checker.isPalindromePermutation("abcd"));
        assertFalse(checker.isPalindromePermutation("ab"));
    }
}