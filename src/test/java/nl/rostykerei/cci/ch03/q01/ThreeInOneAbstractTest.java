package nl.rostykerei.cci.ch03.q01;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class ThreeInOneAbstractTest extends AbstractFactoryTest<ThreeInOne<Integer>> {

    protected static final int NUMBER_OF_STACKS = 3;
    protected static final int CAPACITY = 2;

    @Test
    public void testStack() {

        assertTrue(testInstance.isEmpty(0));

        testInstance.push(1, 0);

        assertFalse(testInstance.isEmpty(0));

        testInstance.push(2, 0);

        testInstance.push(3, 1);
        testInstance.push(4, 1);

        testInstance.push(5, 2);
        testInstance.push(6, 2);

        assertEquals(2, (int) testInstance.pop(0));

        assertFalse(testInstance.isEmpty(0));

        assertEquals(1, (int) testInstance.peek(0));

        assertFalse(testInstance.isEmpty(0));

        assertEquals(1, (int) testInstance.pop(0));

        assertTrue(testInstance.isEmpty(0));

        assertEquals(4, (int) testInstance.pop(1));
        assertEquals(3, (int) testInstance.pop(1));

        assertEquals(6, (int) testInstance.pop(2));
        assertEquals(5, (int) testInstance.pop(2));
    }

    @Test(expected = StackOverflowError.class)
    public void testStackOverflow() {
        testInstance.push(1, 0);
        testInstance.push(2, 0);
        testInstance.push(3, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongStackNumber() {
        testInstance.push(1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongStackNumber2() {
        testInstance.push(1, -2);
    }

    @Test(expected = EmptyStackException.class)
    public void popEmpty() {
        testInstance.pop(1);
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() {
        testInstance.peek(1);
    }
}
