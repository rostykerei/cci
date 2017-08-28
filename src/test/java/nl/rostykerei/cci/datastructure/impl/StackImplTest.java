package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Stack;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackImplTest {

    @Test
    public void pop() throws Exception {
        Stack<Integer> stack = new StackImpl<>();

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
    public void popEmpty() throws Exception {
        Stack<Integer> stack = new StackImpl<>();
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() throws Exception {
        Stack<Integer> stack = new StackImpl<>();
        stack.peek();
    }

    @Test
    public void isEmpty() throws Exception {
        Stack<Integer> stack = new StackImpl<>();

        assertTrue(stack.isEmpty());

        stack.push(1);

        assertFalse(stack.isEmpty());
    }

}