package nl.rostykerei.cci.ch01.q09;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringRotationTest {
    @Test
    public void isStringRotation() throws Exception {
        assertTrue(StringRotation.isStringRotation("waterbottle", "erbottlewat"));
        assertFalse(StringRotation.isStringRotation("waterbottle", "eybottlewxt"));
        assertTrue(StringRotation.isStringRotation("waterbottle", "waterbottle"));
        assertFalse(StringRotation.isStringRotation("waterbottle", "eewaterbottle"));
    }

}