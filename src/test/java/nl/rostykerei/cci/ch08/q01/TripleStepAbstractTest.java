package nl.rostykerei.cci.ch08.q01;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class TripleStepAbstractTest extends AbstractFactoryTest<TripleStep> {

    @Test
    public void testPossibleWays() {
        assertEquals(1, testInstance.countPossibleWays(1));
        assertEquals(2, testInstance.countPossibleWays(2));
        assertEquals(4, testInstance.countPossibleWays(3));
        assertEquals(7, testInstance.countPossibleWays(4));
        assertEquals(13, testInstance.countPossibleWays(5));

        assertEquals(1, testInstance.countPossibleWays(0));
        assertEquals(0, testInstance.countPossibleWays(-1));
    }
}