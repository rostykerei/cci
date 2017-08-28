package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Queue;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueImplTest {

    @Test
    public void queueTest() throws Exception {
        Queue<Integer> queue = new QueueImpl<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertEquals(1, (int) queue.peek());
        assertEquals(1, (int) queue.remove());

        assertEquals(2, (int) queue.peek());
        assertEquals(2, (int) queue.remove());

        assertEquals(3, (int) queue.peek());
        assertEquals(3, (int) queue.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeEmpty() throws Exception {
        Queue<Integer> queue = new QueueImpl<>();
        queue.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void peekEmpty() throws Exception {
        Queue<Integer> queue = new QueueImpl<>();
        queue.peek();
    }

    @Test
    public void isEmpty() throws Exception {
        Queue<Integer> queue = new QueueImpl<>();

        assertTrue(queue.isEmpty());

        queue.add(1);

        assertFalse(queue.isEmpty());

        queue.peek();

        assertFalse(queue.isEmpty());

        queue.remove();

        assertTrue(queue.isEmpty());
    }

}