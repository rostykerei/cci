package nl.rostykerei.cci.ch03.q05;

import nl.rostykerei.cci.datastructure.Stack;
import nl.rostykerei.cci.datastructure.impl.StackImpl;

/**
 * Implementation of {@link SortStack}.
 *
 * @param <T> the class of the objects in the stack
 * @author Rosty Kerei
 */
public final class SortStackImpl<T extends Comparable<? super T>>
        implements SortStack<T> {

    @Override
    public void sort(final Stack<T> stack) {
        Stack<T> sorted = new StackImpl<>();

        while (!stack.isEmpty()) {
            Stack<T> temp = new StackImpl<>();
            T min = findMin(stack, temp, null);

            sorted.push(min);

            temp = removeItem(temp, min);

            swap(temp, stack);
        }

        swap(sorted, stack);
    }

    /**
     * Recursively find a min value and pours out stack.
     *
     * @param stack    input stack
     * @param out      out stack
     * @param minValue min value, initial null
     * @return min value
     */
    private T findMin(final Stack<T> stack, final Stack<T> out,
                      final T minValue) {
        if (stack.isEmpty()) {
            return minValue;
        }

        T val = stack.pop();
        out.push(val);

        T min = minValue;

        if (minValue == null || val.compareTo(minValue) < 1) {
            min = val;
        }

        return findMin(stack, out, min);
    }


    /**
     * Removes the item from the stack.
     *
     * @param stack  input stack
     * @param remove node to remove
     * @return new stack without removed node
     */
    private Stack<T> removeItem(final Stack<T> stack, final T remove) {
        Stack<T> result = new StackImpl<>();
        boolean removed = false;

        while (!stack.isEmpty()) {
            T item = stack.pop();

            if (item.equals(remove) && !removed) {
                removed = true;
            } else {
                result.push(item);
            }
        }

        return result;
    }

    /**
     * Moves stack upside down from in to out.
     *
     * @param in  input stack
     * @param out output stack
     */
    private void swap(final Stack<T> in, final Stack<T> out) {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
}
