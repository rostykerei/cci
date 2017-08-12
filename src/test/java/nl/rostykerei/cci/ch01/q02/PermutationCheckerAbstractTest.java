package nl.rostykerei.cci.ch01.q02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class PermutationCheckerAbstractTest<T extends PermutationChecker> {

    private T checker;

    protected abstract T createChecker();

    @Before
    public void setUp() {
        checker = createChecker();
    }


    @Test
    public void isTrue() throws Exception {
        assertTrue(checker.isPermutation("abcde", "dcbae"));
        assertTrue(checker.isPermutation("aaabbbccc", "abcabcabc"));
        assertTrue(checker.isPermutation("1", "1"));
        assertTrue(checker.isPermutation("", ""));
    }

    @Test
    public void isFalse() throws Exception {
        assertFalse(checker.isPermutation("abc", "abd"));
        assertFalse(checker.isPermutation("abcabc", "abcadb"));
        assertFalse(checker.isPermutation("abcabc", "abc"));
    }
}