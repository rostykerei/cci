package nl.rostykerei.cci.ch01.q06;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class StringCompressionAbstractTest extends AbstractFactoryTest<StringCompression> {

    @Test
    public void compress() throws Exception {
        assertEquals("a2b1c5a3", testInstance.compress("aabcccccaaa"));
        assertEquals("a2b3", testInstance.compress("aabbb"));
        assertEquals("a4b1", testInstance.compress("aaaab"));
        assertEquals("a1b4", testInstance.compress("abbbb"));
        assertEquals("a5", testInstance.compress("aaaaa"));
        assertEquals("abcdefg", testInstance.compress("abcdefg"));
    }

}