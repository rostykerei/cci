package nl.rostykerei.cci.ch03.q03;

import nl.rostykerei.cci.datastructure.Stack;
import nl.rostykerei.cci.datastructure.impl.StackImpl;

import java.util.EmptyStackException;

/**
 * Simple implementation of {@link SetOfStacks}.
 * It uses stack of stacks and does not support popAt(int i) method.
 *
 * @param <T> the class of the objects in the stacks
 * @author Rosty Kerei
 */
public final class SetOfStacksSimple<T> implements SetOfStacks<T> {

    /**
     * Each stack capacity.
     */
    private int capacity;

    /**
     * Size of the top stack.
     */
    private int topSize = 0;

    /**
     * Reference to the top stack.
     */
    private Stack<T> top = null;

    /**
     * Stack of stacks.
     */
    private Stack<Stack<T>> stackOfStacks;

    /**
     * Constructor.
     *
     * @param capacityValue capacity of each of the stacks.
     */
    public SetOfStacksSimple(final int capacityValue) {
        if (capacityValue < 1) {
            throw new IllegalArgumentException(
                    "Stack capacity should be greater than 0"
            );
        }
        this.capacity = capacityValue;
        stackOfStacks = new StackImpl<>();
    }

    @Override
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T item = top.pop();
        topSize--;

        if (topSize == 0) {
            stackOfStacks.pop();

            if (stackOfStacks.isEmpty()) {
                top = null;
                topSize = 0;
            } else {
                top = stackOfStacks.peek();
                topSize = capacity;
            }
        }

        return item;
    }

    @Override
    public void push(final T item) {
        if (top == null) {
            top = new StackImpl<>();
            stackOfStacks.push(top);
        }

        top.push(item);
        topSize++;

        if (topSize >= capacity) {
            top = null;
            topSize = 0;
        }
    }

    @Override
    public T peek() {
        return stackOfStacks.peek().peek();
    }

    @Override
    public boolean isEmpty() {
        return stackOfStacks.isEmpty();
    }

    @Override
    public T popAt(final int stackNumber) {
        throw new UnsupportedOperationException();
    }
}
