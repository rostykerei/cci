package nl.rostykerei.cci.ch03.q01;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Implementation of {@link ThreeInOne}.
 *
 * @param <T> the class of the objects in the stack
 * @author Rosty Kerei
 */
public final class ThreeInOneImpl<T> implements ThreeInOne<T> {

    /**
     * Array to hold all elements of all stacks.
     */
    private Object[] elements;

    /**
     * Index positions of all stacks.
     */
    private int[] indexes;

    /**
     * Stack capacity.
     */
    private int capacity;

    /**
     * Constructor.
     *
     * @param numberOfStacks number of stacks to hold
     * @param stackCapacity capacity of each of the stacks
     */
    public ThreeInOneImpl(final int numberOfStacks, final int stackCapacity) {
        this.elements = new Object[stackCapacity * numberOfStacks];
        this.indexes = new int[numberOfStacks];
        Arrays.fill(this.indexes, -1);

        this.capacity = stackCapacity;
    }

    @Override
    public T pop(final int stackNumber) {
        T element = peek(stackNumber);
        indexes[stackNumber]--;

        return element;
    }

    @Override
    public void push(final T item, final int stackNumber) {
        checkStackNumber(stackNumber);

        if (indexes[stackNumber] == capacity - 1) {
            throw new StackOverflowError(
                    "Stack number " + stackNumber + " overflows");
        }

        elements[stackNumber * capacity + ++indexes[stackNumber]] = item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek(final int stackNumber) {
        if (isEmpty(stackNumber)) {
            throw new EmptyStackException();
        }

        return (T) elements[stackNumber * capacity + indexes[stackNumber]];
    }

    @Override
    public boolean isEmpty(final int stackNumber) {
        checkStackNumber(stackNumber);

        return indexes[stackNumber] < 0;
    }

    /**
     * Checks validity of the stack number.
     *
     * @param stackNumber stack number to validate
     * @throws IllegalArgumentException on a wrong stack number
     */
    private void checkStackNumber(final int stackNumber) {
        if (stackNumber < 0 || stackNumber > this.indexes.length - 1) {
            throw new IllegalArgumentException("Incorrect stack number");
        }
    }
}
