package nl.rostykerei.cci.ch03.q02;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public abstract class StackMinAbstractTest extends AbstractFactoryTest<StackMin> {

    @Test
    public void testMin() throws Exception {
        testInstance.push(3);
        testInstance.push(2);
        testInstance.push(1);

        assertEquals(1, testInstance.min());

        testInstance.pop();

        assertEquals(2, testInstance.min());
    }

    @Test(expected = EmptyStackException.class)
    public void minEmpty() throws Exception {
        testInstance.push(1);
        assertEquals(1, testInstance.min());

        testInstance.pop();

        testInstance.min();
    }

    @Test(expected = EmptyStackException.class)
    public void popEmpty() throws Exception {
        testInstance.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() throws Exception {
        testInstance.peek();
    }

    @Test
    public void isEmpty() throws Exception {
        assertTrue(testInstance.isEmpty());

        testInstance.push(1);

        assertFalse(testInstance.isEmpty());

        testInstance.peek();

        assertFalse(testInstance.isEmpty());

        testInstance.pop();

        assertTrue(testInstance.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void pushNull() throws Exception {
        testInstance.push(null);
    }
}
