package nl.rostykerei.cci.ch01.q03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class URLifyAbstractTest {

    private URLify urlify;

    protected abstract URLify createUrlfy();

    @Before
    public void setUp() {
        this.urlify = createUrlfy();
    }

    @Test
    public void replaceSpaces() throws Exception {
        assertEquals("Mr%20John%20Smith", new String(urlify.replaceSpaces("Mr John Smith    ".toCharArray(), 13)));
    }

}
