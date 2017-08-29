package nl.rostykerei.cci.datastructure;

import java.util.List;

/**
 * Common interface for the linked lists.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface LinkedList<T> {

    /**
     * Sets data to the node.
     *
     * @param value data
     */
    void setData(T value);

    /**
     * Gets data from the node.
     *
     * @return data
     */
    T getData();

    /**
     * Converts linked list to a {@link List}.
     *
     * @return list
     */
    List<T> toList();

}
