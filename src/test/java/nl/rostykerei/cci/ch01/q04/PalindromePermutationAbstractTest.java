package nl.rostykerei.cci.ch01.q04;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class PalindromePermutationAbstractTest extends AbstractFactoryTest<PalindromePermutation> {

    @Test
    public void testTrue() throws Exception {
        assertTrue(testInstance.isPalindromePermutation("abcxcba"));
        assertTrue(testInstance.isPalindromePermutation("tacocat"));
        assertTrue(testInstance.isPalindromePermutation("xxxyyyxxx"));
        assertTrue(testInstance.isPalindromePermutation("aabxb"));
        assertTrue(testInstance.isPalindromePermutation("a"));
        assertTrue(testInstance.isPalindromePermutation("xx"));
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(testInstance.isPalindromePermutation("axxb"));
        assertFalse(testInstance.isPalindromePermutation("abcd"));
        assertFalse(testInstance.isPalindromePermutation("ab"));
    }
}