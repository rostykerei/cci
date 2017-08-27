package nl.rostykerei.cci.ch02.q03;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.3 - Delete Middle Node.
 *
 * @author Rosty Kerei
 * @param <T> the class of the objects in the list
 */
public interface DeleteMiddleNode<T> {

    /**
     * Delete the node from list.
     *
     * @param node node to delete
     */
    void deleteMiddleNode(LinkedListNode<T> node);
}
