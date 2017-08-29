package nl.rostykerei.cci.datastructure;

/**
 * Doubly-linked list.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface DoublyLinkedList<T> extends LinkedList<T> {

    /**
     * Sets next node.
     *
     * @param nextNode next node
     * @return self
     */
    DoublyLinkedList<T> setNext(DoublyLinkedList<T> nextNode);

    /**
     * Gets next node.
     *
     * @return next node or null if there is no next
     */
    DoublyLinkedList<T> getNext();

    /**
     * Sets previous node.
     *
     * @param previousNode previous node
     * @return self
     */
    DoublyLinkedList<T> setPrevious(DoublyLinkedList<T> previousNode);

    /**
     * Gets previous node.
     *
     * @return previous node of null if there is no previous
     */
    DoublyLinkedList<T> getPrevious();

    /**
     * Checks if the node is the first one.
     *
     * @return true if the node if the first one, false otherwise
     */
    boolean isFirst();

    /**
     * Checks if the node is the last one.
     *
     * @return true if the node if the last one, false otherwise
     */
    boolean isLast();

}
