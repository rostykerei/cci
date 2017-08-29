package nl.rostykerei.cci.datastructure;

/**
 * Singly-linked list.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface SinglyLinkedList<T> extends LinkedList<T> {

    /**
     * Sets next node.
     *
     * @param nextNode next node
     * @return self
     */
    SinglyLinkedList<T> setNext(SinglyLinkedList<T> nextNode);

    /**
     * Gets next node.
     *
     * @return next node or null if there is no next
     */
    SinglyLinkedList<T> getNext();

    /**
     * Checks if the node is the last one.
     *
     * @return true if the node if the last one, false otherwise
     */
    boolean isLast();

}
