package nl.rostykerei.cci.ch01.q03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URLifyTest {
    @Test
    public void replaceSpaces() throws Exception {

        assertEquals("Mr%20John%20Smith", new String(URLify.replaceSpaces("Mr John Smith    ".toCharArray(), 13)));

    }

}