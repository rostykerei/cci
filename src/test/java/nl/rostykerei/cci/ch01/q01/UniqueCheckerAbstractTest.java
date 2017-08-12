package nl.rostykerei.cci.ch01.q01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class UniqueCheckerAbstractTest<T extends UniqueCharsChecker> {

    private T checker;

    protected abstract T createChecker();

    @Before
    public void setUp() {
        checker = createChecker();
    }

    @Test
    public void testTrue() {
        assertTrue(checker.isUniqueCharsOnly("abcdefg"));
        assertTrue(checker.isUniqueCharsOnly("12345"));
        assertTrue(checker.isUniqueCharsOnly("12345"));
        assertTrue(checker.isUniqueCharsOnly(""));
    }

    @Test
    public void testFalse() {
        assertFalse(checker.isUniqueCharsOnly("abcaefg"));
        assertFalse(checker.isUniqueCharsOnly("123451"));
        assertFalse(checker.isUniqueCharsOnly("1234526"));
        assertFalse(checker.isUniqueCharsOnly("00"));
    }

}
