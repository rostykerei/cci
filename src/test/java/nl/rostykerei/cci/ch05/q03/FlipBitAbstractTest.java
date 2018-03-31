package nl.rostykerei.cci.ch05.q03;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class FlipBitAbstractTest extends AbstractFactoryTest<FlipBit> {

    @Test
    public void test1() {
        assertEquals(8, testInstance.flipBit(1775));
    }
}