package nl.rostykerei.cci.ch03.q05;

import nl.rostykerei.cci.datastructure.Stack;

/**
 * Question 3.5 - Sort Stack.
 *
 * @param <T> the class of the objects in the stack
 * @author Rosty Kerei
 */
public interface SortStack<T extends Comparable> {

    /**
     * Sorts given stack.
     *
     * @param stack stack to sort
     */
    void sort(Stack<T> stack);

}
