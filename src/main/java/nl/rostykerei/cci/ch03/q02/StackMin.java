package nl.rostykerei.cci.ch03.q02;

import nl.rostykerei.cci.datastructure.Stack;

/**
 * Question 3.2 - Stack Min.
 *
 * @author Rosty Kerei
 */
public interface StackMin extends Stack<Integer> {

    /**
     * Returns the minimum value within the stack.
     *
     * @throws java.util.EmptyStackException if the stack is empty
     * @return minimum value within the stack
     */
    int min();

}
