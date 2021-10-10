package nl.rostykerei.cci.ch03.q03;

import nl.rostykerei.cci.datastructure.impl.StackImpl;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implementation of {@link SetOfStacks}.
 *
 * @param <T> the class of the objects in the stacks
 * @author Rosty Kerei
 */
public final class SetOfStacksFull<T> implements SetOfStacks<T> {

    /**
     * List of stacks.
     */
    private final ArrayList<StackWithSize<T>> stacks = new ArrayList<>();

    /**
     * Each stack capacity.
     */
    private final int capacity;

    /**
     * Constructor.
     *
     * @param capacityValue capacity of each stack
     */
    public SetOfStacksFull(final int capacityValue) {
        this.capacity = capacityValue;
    }

    @Override
    public T popAt(final int stackNumber) {
        if (stacks.isEmpty()) {
            throw new EmptyStackException();
        }

        if (stacks.size() <= stackNumber - 1) {
            throw new IllegalArgumentException(
                    "Stack #" + stackNumber + " does not exists"
            );
        }

        T item = stacks.get(stackNumber).pop();

        if (stacks.get(stackNumber).isEmpty()) {
            stacks.remove(stackNumber);
        }

        return item;
    }

    @Override
    public T pop() {
        return popAt(stacks.size() - 1);
    }

    @Override
    public void push(final T item) {
        if (stacks.isEmpty()) {
            stacks.add(new StackWithSize<>());
        }

        if (getLastStack().size == capacity) {
            stacks.add(new StackWithSize<>());
        }

        getLastStack().push(item);
    }

    @Override
    public T peek() {
        if (stacks.isEmpty()) {
            throw new EmptyStackException();
        }

        return getLastStack().peek();
    }

    @Override
    public boolean isEmpty() {
        return stacks.isEmpty();
    }

    /**
     * Retrieves the last stack.
     *
     * @return last stack
     */
    private StackWithSize<T> getLastStack() {
        return stacks.get(stacks.size() - 1);
    }

    /**
     * Extension of the {@link StackImpl} containing the size.
     *
     * @param <E> the class of the objects in the stack
     */
    private static class StackWithSize<E> extends StackImpl<E> {

        /**
         * Size of the stack.
         */
        private int size = 0;

        @Override
        public E pop() {
            size--;
            return super.pop();
        }

        @Override
        public void push(final E item) {
            size++;
            super.push(item);
        }
    }
}
