package nl.rostykerei.cci.ch03.q02;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class StackMinAbstractTest extends AbstractFactoryTest<StackMin> {

    @Test
    public void testMin() {
        testInstance.push(3);
        testInstance.push(2);
        testInstance.push(1);

        assertEquals(1, testInstance.min());

        testInstance.pop();

        assertEquals(2, testInstance.min());
    }

    @Test(expected = EmptyStackException.class)
    public void minEmpty() {
        testInstance.push(1);
        assertEquals(1, testInstance.min());

        testInstance.pop();

        testInstance.min();
    }

    @Test(expected = EmptyStackException.class)
    public void popEmpty() {
        testInstance.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() {
        testInstance.peek();
    }

    @Test
    public void isEmpty() {
        assertTrue(testInstance.isEmpty());

        testInstance.push(1);

        assertFalse(testInstance.isEmpty());

        testInstance.peek();

        assertFalse(testInstance.isEmpty());

        testInstance.pop();

        assertTrue(testInstance.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void pushNull() {
        testInstance.push(null);
    }
}
