package nl.rostykerei.cci.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Doubly linked list implementation.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public class LinkedListNode<T> {

    /**
     * Link to the previous node.
     */
    private LinkedListNode<T> previous;

    /**
     * Link to the next node.
     */
    private LinkedListNode<T> next;

    /**
     * Data holder.
     */
    private T data;

    /**
     * Node's constructor.
     *
     * @param dataValue data
     */
    public LinkedListNode(final T dataValue) {
        this.data = dataValue;
    }

    /**
     * Returns next node.
     *
     * @return next node
     */
    public final LinkedListNode<T> getNext() {
        return next;
    }

    /**
     * Set next node.
     *
     * @param nextNode next node
     * @return this node
     */
    public final LinkedListNode<T> setNext(final LinkedListNode<T> nextNode) {
        if (nextNode != null) {
            nextNode.previous = this;
        }

        this.next = nextNode;
        return this;
    }

    /**
     * Returns previous node.
     *
     * @return previous node
     */
    public final LinkedListNode<T> getPrevious() {
        return previous;
    }

    /**
     * Sets previous node.
     *
     * @param previousValue previous node
     */
    public final void setPrevious(final LinkedListNode<T> previousValue) {
        if (previousValue != null) {
            previousValue.next = this;
        }

        this.previous = previousValue;
    }

    /**
     * Returns data.
     *
     * @return data
     */
    public final T getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param dataValue data
     */
    public final void setData(final T dataValue) {
        this.data = dataValue;
    }

    /**
     * Converts linked list to {@link List}.
     *
     * @return list
     */
    public final List<T> toList() {
        List<T> result = new ArrayList<>();
        LinkedListNode<T> node = this;

        while (node != null) {
            result.add(node.getData());
            node = node.getNext();
        }

        return result;
    }
}
