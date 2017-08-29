package nl.rostykerei.cci.ch03.q02;

import nl.rostykerei.cci.datastructure.Stack;

/**
 * Question 3.2 - Stack Min.
 *
 * @param <T> the class of the objects in the stack
 */
public interface StackMin<T extends Number> extends Stack<T> {

    /**
     * Returns the minimum value within the stack.
     *
     * @throws java.util.EmptyStackException if the stack is empty
     * @return minimum value within the stack
     */
    Number min();

}
