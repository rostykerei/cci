package nl.rostykerei.cci.ch05.q06;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class ConversionAbstractTest extends AbstractFactoryTest<Conversion> {

    @Test
    public void test1() {
        assertEquals(2, testInstance.flipBits(29, 15));
    }
}