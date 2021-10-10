package nl.rostykerei.cci.datastructure;

/**
 * Singly-linked list.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface SinglyLinkedList<T> extends LinkedList<T> {

    /**
     * Gets next node.
     *
     * @return next node or null if there is no next
     */
    SinglyLinkedList<T> getNext();

    /**
     * Sets next node.
     *
     * @param nextNode next node
     * @return self
     */
    SinglyLinkedList<T> setNext(SinglyLinkedList<T> nextNode);

    /**
     * Checks if the node is the last one.
     *
     * @return true if the node is the last one, false otherwise
     */
    boolean isLast();

}
