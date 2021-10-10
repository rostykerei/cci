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
     * @return first item
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    T remove();

    /**
     * Returns the first item of the queue.
     *
     * @return the first item
     */
    T peek();

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();
}
