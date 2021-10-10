package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Queue;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueImplTest {

    protected Queue<Integer> createQueue() {
        return new QueueImpl<>();
    }

    @Test
    public void queueTest() {
        Queue<Integer> queue = createQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertEquals(1, (int) queue.peek());
        assertEquals(1, (int) queue.remove());

        assertEquals(2, (int) queue.peek());
        assertEquals(2, (int) queue.remove());

        assertEquals(3, (int) queue.peek());
        assertEquals(3, (int) queue.remove());

        queue.add(4);

        assertEquals(4, (int) queue.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeEmpty() {
        Queue<Integer> queue = createQueue();
        queue.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void peekEmpty() {
        Queue<Integer> queue = createQueue();
        queue.peek();
    }

    @Test
    public void isEmpty() {
        Queue<Integer> queue = createQueue();

        assertTrue(queue.isEmpty());

        queue.add(1);

        assertFalse(queue.isEmpty());

        queue.peek();

        assertFalse(queue.isEmpty());

        queue.remove();

        assertTrue(queue.isEmpty());
    }

}
