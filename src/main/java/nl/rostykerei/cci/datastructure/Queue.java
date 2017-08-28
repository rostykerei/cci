package nl.rostykerei.cci.datastructure;

/**
 * Interface for the basic queue data structure.
 *
 * @param <T> the class of the objects in the queue
 * @author Rosty Kerei
 */
public interface Queue<T> {

    /**
     * Adds an item to the end of the queue.
     *
     * @param item item to add
     */
    void add(T item);

    /**
     * Removes the first item from the queue.
     *
     * @throws java.util.NoSuchElementException if the queue is empty
     * @return first item
     */
    T remove();

    /**
     * Returns the top of the queue.
     *
     * @return top item
     */
    T peek();

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue if empty, false otherwise
     */
    boolean isEmpty();
}
