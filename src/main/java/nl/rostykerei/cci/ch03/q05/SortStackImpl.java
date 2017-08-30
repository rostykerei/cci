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
            T min = null;
            Stack<T> temp = new StackImpl<>();

            while (!stack.isEmpty()) {
                T item = stack.pop();

                if (min == null) {
                    min = item;
                } else if (item.compareTo(min) < 0) {
                    min = item;
                }

                temp.push(item);
            }

            sorted.push(min);

            temp = removeItem(temp, min);

            swap(temp, stack);
        }

        swap(sorted, stack);
    }


    /**
     * Removes the item from the stack.
     *
     * @param stack input stack
     * @param remove node to remove
     * @return new stack without removed node
     */
    private Stack<T> removeItem(final Stack<T> stack, final T remove) {
        Stack<T> result = new StackImpl<>();
        boolean removed = false;

        while (!stack.isEmpty()) {
            T item = stack.pop();

            if (remove.equals(item) && !removed) {
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
     * @param in input stack
     * @param out output stack
     */
    private void swap(final Stack<T> in, final Stack<T> out) {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
}
