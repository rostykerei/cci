package nl.rostykerei.cci.ch01.q02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class CheckPermutationAbstractTest<T extends CheckPermutation> {

    private T checker;

    protected abstract T createChecker();

    @Before
    public void setUp() {
        checker = createChecker();
    }


    @Test
    public void isTrue() throws Exception {
        assertTrue(checker.checkPermutation("abcde", "dcbae"));
        assertTrue(checker.checkPermutation("aaabbbccc", "abcabcabc"));
        assertTrue(checker.checkPermutation("1", "1"));
        assertTrue(checker.checkPermutation("", ""));
    }

    @Test
    public void isFalse() throws Exception {
        assertFalse(checker.checkPermutation("abc", "abd"));
        assertFalse(checker.checkPermutation("abcabc", "abcadb"));
        assertFalse(checker.checkPermutation("abcabc", "abc"));
    }
}