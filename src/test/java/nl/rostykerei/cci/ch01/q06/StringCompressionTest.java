package nl.rostykerei.cci.ch01.q06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    @Test
    public void compress() throws Exception {
        assertEquals("a2b1c5a3", StringCompression.compress("aabcccccaaa"));
        assertEquals("a2b3", StringCompression.compress("aabbb"));
        assertEquals("a4b1", StringCompression.compress("aaaab"));
        assertEquals("a1b4", StringCompression.compress("abbbb"));
        assertEquals("a5", StringCompression.compress("aaaaa"));
        assertEquals("abcdefg", StringCompression.compress("abcdefg"));
    }

}