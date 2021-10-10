package nl.rostykerei.cci.ch03.q01;

/**
 * Question 3.1 - Three In One.
 *
 * @param <T> the class of the objects in the stack
 * @author Rosty Kerei
 */
public interface ThreeInOne<T> {

    /**
     * Removes the top item from the stack.
     *
     * @param stackNumber number of the stack
     * @return top item
     * @throws java.util.EmptyStackException if the stack is empty
     * @throws IllegalArgumentException      if the stack number is not correct
     */
    T pop(int stackNumber);

    /**
     * Adds an item to the top of the stack.
     *
     * @param item        item to add
     * @param stackNumber number of the stack
     * @throws IllegalArgumentException if the stack number is not correct
     * @throws StackOverflowError       if the stack is full
     */
    void push(T item, int stackNumber);

    /**
     * Returns the top item from the stack.
     *
     * @param stackNumber number of the stack
     * @return top item
     * @throws java.util.EmptyStackException if the stack is empty
     * @throws IllegalArgumentException      if the stack number is not correct
     */
    T peek(int stackNumber);

    /**
     * Checks if the stack is empty.
     *
     * @param stackNumber number of the stack
     * @return true if the stack is empty, false otherwise
     * @throws IllegalArgumentException if the stack number is not correct
     */
    boolean isEmpty(int stackNumber);
}
