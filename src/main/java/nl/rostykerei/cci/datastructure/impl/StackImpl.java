package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Stack;

import java.util.EmptyStackException;

/**
 * Implementation of {@link Stack}.
 *
 * @param <T> the class of the objects in the stack
 */
public final class StackImpl<T> implements Stack<T> {

    /**
     * A node within the stack.
     *
     * @param <T> the class of the objects in the stack
     */
    private static class StackNode<T> {

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
         * @param value data
         */
        StackNode(final T value) {
            this.data = value;
        }
    }

    /**
     * Top of the stack.
     */
    private StackNode<T> top;

    @Override
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T item = top.data;

        top = top.next;

        return item;
    }

    @Override
    public void push(final T item) {
        StackNode<T> t = new StackNode<>(item);
        t.next = top;
        top = t;
    }

    @Override
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
