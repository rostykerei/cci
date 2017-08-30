package nl.rostykerei.cci.ch03.q03;

import nl.rostykerei.cci.datastructure.Stack;

/**
 * Question 3.3 - Stack of Plates.
 *
 * @param <T> the class of the objects in the stacks
 * @author Rosty Kerei
 */
public interface SetOfStacks<T> extends Stack<T> {

    /**
     * Pops the item from the specific stack.
     *
     * @param stackNumber number of stack
     * @return top item
     */
    T popAt(int stackNumber);
}
