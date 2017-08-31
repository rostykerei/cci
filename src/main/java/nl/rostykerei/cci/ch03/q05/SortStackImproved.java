package nl.rostykerei.cci.ch03.q05;

import nl.rostykerei.cci.datastructure.Stack;
import nl.rostykerei.cci.datastructure.impl.StackImpl;

/**
 * Improved implementation of {@link SortStack}.
 *
 * @param <T> the class of the objects in the stack
 * @author Rosty Kerei
 */
public final class SortStackImproved<T extends Comparable<? super T>>
        implements SortStack<T> {

    @Override
    public void sort(final Stack<T> stack) {
        Stack<T> sorted = new StackImpl<>();

        while (!stack.isEmpty()) {
            T node = stack.pop();

            while (!sorted.isEmpty() && sorted.peek().compareTo(node) > 0) {
                stack.push(sorted.pop());
            }

            sorted.push(node);
        }

        while (!sorted.isEmpty()) {
            stack.push(sorted.pop());
        }
    }
}
