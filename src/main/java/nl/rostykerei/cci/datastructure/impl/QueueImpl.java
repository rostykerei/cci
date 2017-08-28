package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Queue;

import java.util.NoSuchElementException;

/**
 * Implementation of {@link Queue}.
 *
 * @param <T> the class of the objects in the queue
 * @author Rosty Kerei
 */
public final class QueueImpl<T> implements Queue<T> {

    /**
     * A node within the queue.
     *
     * @param <T> the class of the objects in the queue
     */
    private static class QueueNode<T> {

        /**
         * Data holder.
         */
        private T data;

        /**
         * Next node.
         */
        private QueueNode<T> next;

        /**
         * Node constructor.
         *
         * @param value data value
         */
        QueueNode(final T value) {
            this.data = value;
        }
    }

    /**
     * Link to the first node.
     */
    private QueueNode<T> first;

    /**
     * Link to the last node.
     */
    private QueueNode<T> last;

    @Override
    public void add(final T item) {
        QueueNode<T> t = new QueueNode<>(item);

        if (last != null) {
            last.next = t;
        }

        last = t;

        if (first == null) {
            first = last;
        }

    }

    @Override
    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        T data = first.data;

        first = first.next;

        if (first == null) {
            last = null;
        }

        return data;
    }

    @Override
    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
