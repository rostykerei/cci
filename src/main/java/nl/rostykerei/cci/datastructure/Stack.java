package nl.rostykerei.cci.datastructure;

/**
 * Interface for the basic stack data structure.
 *
 * @param <T> the class of the objects in the stack
 * @author Rosty Kerei
 */
public interface Stack<T> {

    /**
     * Removes the top item from the stack.
     *
     * @throws java.util.EmptyStackException if stack is empty
     * @return top item
     */
    T pop();

    /**
     * Adds an item to the top of the stack.
     *
     * @param item item to add
     */
    void push(T item);

    /**
     * Returns the top item from the stack.
     *
     * @throws java.util.EmptyStackException if stack is empty
     * @return top item
     */
    T peek();

    /**
     * Checks if stack is empty.
     *
     * @return true if stack if empty, false otherwise
     */
    boolean isEmpty();
}
