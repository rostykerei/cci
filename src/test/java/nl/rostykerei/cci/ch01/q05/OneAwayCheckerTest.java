package nl.rostykerei.cci.ch01.q05;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OneAwayCheckerTest {

    @Test
    public void testTrue() throws Exception {
        assertTrue(OneAwayChecker.isOneAway("pale", "ple"));
        assertTrue(OneAwayChecker.isOneAway("pales", "pale"));
        assertTrue(OneAwayChecker.isOneAway("pale", "bale"));
        assertTrue(OneAwayChecker.isOneAway("", "x"));
        assertTrue(OneAwayChecker.isOneAway("x", "xz"));
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(OneAwayChecker.isOneAway("pale", "bake"));
        assertFalse(OneAwayChecker.isOneAway("pale", "pke"));
        assertFalse(OneAwayChecker.isOneAway("pale", "pe"));
        assertFalse(OneAwayChecker.isOneAway("pale", "xpaley"));

        assertFalse(OneAwayChecker.isOneAway("pale", "pale"));
    }
}