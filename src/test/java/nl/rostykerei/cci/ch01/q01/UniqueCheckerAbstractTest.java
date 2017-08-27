package nl.rostykerei.cci.ch01.q01;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class UniqueCheckerAbstractTest extends AbstractFactoryTest<IsUnique> {

    @Test
    public void testTrue() {
        assertTrue(testInstance.isUniqueCharsOnly("abcdefg"));
        assertTrue(testInstance.isUniqueCharsOnly("12345"));
        assertTrue(testInstance.isUniqueCharsOnly("12345"));
        assertTrue(testInstance.isUniqueCharsOnly(""));
    }

    @Test
    public void testFalse() {
        assertFalse(testInstance.isUniqueCharsOnly("abcaefg"));
        assertFalse(testInstance.isUniqueCharsOnly("123451"));
        assertFalse(testInstance.isUniqueCharsOnly("1234526"));
        assertFalse(testInstance.isUniqueCharsOnly("00"));
    }

}
