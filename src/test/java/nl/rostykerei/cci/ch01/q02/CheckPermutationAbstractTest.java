package nl.rostykerei.cci.ch01.q02;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class CheckPermutationAbstractTest extends AbstractFactoryTest<CheckPermutation> {

    @Test
    public void isTrue() throws Exception {
        assertTrue(testInstance.checkPermutation("abcde", "dcbae"));
        assertTrue(testInstance.checkPermutation("aaabbbccc", "abcabcabc"));
        assertTrue(testInstance.checkPermutation("1", "1"));
        assertTrue(testInstance.checkPermutation("", ""));
    }

    @Test
    public void isFalse() throws Exception {
        assertFalse(testInstance.checkPermutation("abc", "abd"));
        assertFalse(testInstance.checkPermutation("abcabc", "abcadb"));
        assertFalse(testInstance.checkPermutation("abcabc", "abc"));
    }
}