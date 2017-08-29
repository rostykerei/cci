package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Stack;

import java.util.EmptyStackException;

/**
 * Implementation of {@link Stack}.
 *
 * @param <T> the class of the objects in the stack
 */
public class StackImpl<T> implements Stack<T> {

    /**
     * A node within the stack.
     *
     * @param <T> the class of the objects in the stack
     */
    public static class StackNode<T> {

        /**
         * Data holder.
         */
        private T data;

        /**
         * Link to the next node.
         */
        private StackNode<T> next;

        /**
         * Stack node constructor.
         *
         * @param value data
         */
        public StackNode(final T value) {
            this.data = value;
        }

        /**
         * Sets next node.
         *
         * @param node next node
         */
        public void setNext(final StackNode<T> node) {
            this.next = node;
        }
    }

    /**
     * Top of the stack.
     */
    private StackNode<T> top;

    /**
     * {@inheritDoc}
     */
    @Override
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T item = top.data;

        top = top.next;

        return item;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(final T item) {
        StackNode<T> t = new StackNode<>(item);
        t.next = top;
        top = t;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Gets top node.
     *
     * @return top node
     */
    protected StackNode<T> getTop() {
        return top;
    }

    /**
     * Sets top node.
     *
     * @param node top node
     */
    protected void setTop(final StackNode<T> node) {
        this.top = node;
    }
}
