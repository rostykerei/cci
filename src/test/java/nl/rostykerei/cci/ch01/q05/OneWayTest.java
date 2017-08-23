package nl.rostykerei.cci.ch01.q05;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneWayTest {

    @Test
    public void testTrue() throws Exception {
        assertTrue(OneWay.isOneAway("pale", "ple"));
        assertTrue(OneWay.isOneAway("pales", "pale"));
        assertTrue(OneWay.isOneAway("pale", "bale"));
        assertTrue(OneWay.isOneAway("", "x"));
        assertTrue(OneWay.isOneAway("x", "xz"));
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(OneWay.isOneAway("pale", "bake"));
        assertFalse(OneWay.isOneAway("pale", "pke"));
        assertFalse(OneWay.isOneAway("pale", "pe"));
        assertFalse(OneWay.isOneAway("pale", "xpaley"));

        assertFalse(OneWay.isOneAway("pale", "pale"));
    }
}