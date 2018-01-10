package nl.rostykerei.cci.ch08.q03;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public abstract class MagicIndexAbstractTest extends AbstractFactoryTest<MagicIndex> {

    @Test
    public void testFindMagicIndex() {
        int[] input = {-10, -5, 0, 1, 2, 5, 7};

        assertEquals(5, (int) testInstance.findMagicIndex(input));
    }

    @Test
    public void testFindMagicIndex2() {
        int[] input = {-10, 0, 2, 5, 7, 10, 50, 100};

        assertEquals(2, (int) testInstance.findMagicIndex(input));
    }

    @Test
    public void testFindMagicIndexNull() {
        int[] input = {-10, -5, 0, 1, 2, 3, 5};

        assertNull(testInstance.findMagicIndex(input));
    }
}
