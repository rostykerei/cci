package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Stack;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackImplTest {

    protected Stack<Integer> createStack() {
        return new StackImpl<>();
    }

    @Test
    public void stackTest() {
        Stack<Integer> stack = createStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, (int) stack.peek());
        assertEquals(3, (int) stack.pop());

        assertEquals(2, (int) stack.peek());
        assertEquals(2, (int) stack.pop());

        assertEquals(1, (int) stack.peek());
        assertEquals(1, (int) stack.pop());
    }

    @Test(expected = EmptyStackException.class)
    public void popEmpty() {
        Stack<Integer> stack = createStack();
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() {
        Stack<Integer> stack = createStack();
        stack.peek();
    }

    @Test
    public void isEmpty() {
        Stack<Integer> stack = createStack();

        assertTrue(stack.isEmpty());

        stack.push(1);

        assertFalse(stack.isEmpty());

        stack.peek();

        assertFalse(stack.isEmpty());

        stack.pop();

        assertTrue(stack.isEmpty());
    }

}
