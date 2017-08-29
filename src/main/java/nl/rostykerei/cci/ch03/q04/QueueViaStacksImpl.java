package nl.rostykerei.cci.ch03.q04;

import nl.rostykerei.cci.datastructure.Queue;
import nl.rostykerei.cci.datastructure.Stack;
import nl.rostykerei.cci.datastructure.impl.StackImpl;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Question 3.4 - Queue Via Stacks.
 *
 * @param <T> the class of the objects in the stack
 * @author Rosty Kerei
 */
public final class QueueViaStacksImpl<T> implements Queue<T> {

    /**
     * Forward stack.
     */
    private Stack<T> forward = new StackImpl<>();

    /**
     * Backward stack.
     */
    private Stack<T> backward = new StackImpl<>();

    @Override
    public void add(final T item) {
        forward.push(item);
    }

    @Override
    public T remove() {
        fillBackward();

        try {
            return backward.pop();
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public T peek() {
        fillBackward();

        try {
            return backward.peek();
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean isEmpty() {
        return forward.isEmpty() && backward.isEmpty();
    }

    /**
     * Populates backward stack.
     */
    private void fillBackward() {
        while (!forward.isEmpty()) {
            backward.push(forward.pop());
        }
    }
}
