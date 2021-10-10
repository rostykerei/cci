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
     * @return top item
     * @throws java.util.EmptyStackException if the stack is empty
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
     * @return top item
     * @throws java.util.EmptyStackException if the stack is empty
     */
    T peek();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
}
