package nl.rostykerei.cci.ch01.q05;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class OneWayAbstractTest extends AbstractFactoryTest<OneWay> {

    @Test
    public void testTrue() throws Exception {
        assertTrue(testInstance.isOneAway("pale", "ple"));
        assertTrue(testInstance.isOneAway("pales", "pale"));
        assertTrue(testInstance.isOneAway("pale", "bale"));
        assertTrue(testInstance.isOneAway("", "x"));
        assertTrue(testInstance.isOneAway("x", "xz"));
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(testInstance.isOneAway("pale", "bake"));
        assertFalse(testInstance.isOneAway("pale", "pke"));
        assertFalse(testInstance.isOneAway("pale", "pe"));
        assertFalse(testInstance.isOneAway("pale", "xpaley"));

        assertFalse(testInstance.isOneAway("pale", "pale"));
    }
}