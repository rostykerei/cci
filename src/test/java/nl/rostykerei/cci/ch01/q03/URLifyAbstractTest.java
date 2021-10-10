package nl.rostykerei.cci.ch01.q03;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class URLifyAbstractTest extends AbstractFactoryTest<URLify> {

    @Test
    public void replaceSpaces() {
        assertEquals("Mr%20John%20Smith", new String(testInstance.replaceSpaces("Mr John Smith    ".toCharArray(), 13)));
    }

    @Test
    public void replaceNoSpaces() {
        assertEquals("test", new String(testInstance.replaceSpaces("test".toCharArray(), 4)));
    }

    @Test
    public void replaceSpacesEmpty() {
        assertEquals("", new String(testInstance.replaceSpaces("".toCharArray(), 0)));
    }

}
