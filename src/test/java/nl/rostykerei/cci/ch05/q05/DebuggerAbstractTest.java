package nl.rostykerei.cci.ch05.q05;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class DebuggerAbstractTest extends AbstractFactoryTest<Debugger> {

    @Test
    public void test1() {
        assertTrue(testInstance.isZeroOrPowerOfTwo(0));
        assertTrue(testInstance.isZeroOrPowerOfTwo(2));
        assertTrue(testInstance.isZeroOrPowerOfTwo(4));
        assertTrue(testInstance.isZeroOrPowerOfTwo(8));
        assertTrue(testInstance.isZeroOrPowerOfTwo(16));
        assertTrue(testInstance.isZeroOrPowerOfTwo(32));

        assertFalse(testInstance.isZeroOrPowerOfTwo(5));
        assertFalse(testInstance.isZeroOrPowerOfTwo(9));
        assertFalse(testInstance.isZeroOrPowerOfTwo(15));
        assertFalse(testInstance.isZeroOrPowerOfTwo(33));
    }
}