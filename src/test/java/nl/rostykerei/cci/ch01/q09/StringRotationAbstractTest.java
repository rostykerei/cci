package nl.rostykerei.cci.ch01.q09;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class StringRotationAbstractTest extends AbstractFactoryTest<StringRotation> {
    @Test
    public void isStringRotation() {
        assertTrue(testInstance.isStringRotation("waterbottle", "erbottlewat"));
        assertFalse(testInstance.isStringRotation("waterbottle", "eybottlewxt"));
        assertTrue(testInstance.isStringRotation("waterbottle", "waterbottle"));
        assertFalse(testInstance.isStringRotation("waterbottle", "eewaterbottle"));
    }

}
