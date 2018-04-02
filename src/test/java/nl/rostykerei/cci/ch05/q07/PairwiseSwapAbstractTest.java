package nl.rostykerei.cci.ch05.q07;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class PairwiseSwapAbstractTest extends AbstractFactoryTest<PairwiseSwap> {

    @Test
    public void test1() {
        int x = 0b010111;
        int e = 0b101011;

        assertEquals(e, testInstance.swapBits(x));
    }
}