package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Doubly-linked list implementation.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class DoublyLinkedListImpl<T>
        extends AbstractLinkedList<T> implements DoublyLinkedList<T> {

    /**
     * Link to the previous node.
     */
    private DoublyLinkedList<T> previous;

    /**
     * Link to the next node.
     */
    private DoublyLinkedList<T> next;

    /**
     * Constructor.
     *
     * @param value node data value
     */
    public DoublyLinkedListImpl(final T value) {
        this.setData(value);
    }

    @Override
    public DoublyLinkedList<T> setNext(final DoublyLinkedList<T> nextNode) {

        if (nextNode == null && this.next != null) {
            DoublyLinkedList<T> n = this.next;
            this.next = null;
            n.setPrevious(null);

            return this;
        }

        this.next = nextNode;

        if (nextNode != null && nextNode.getPrevious() != this) {
            nextNode.setPrevious(this);
        }

        return this;
    }

    @Override
    public DoublyLinkedList<T> getNext() {
        return this.next;
    }

    @Override
    public DoublyLinkedList<T> getPrevious() {
        return this.previous;
    }

    @Override
    public void setPrevious(
            final DoublyLinkedList<T> previousNode) {

        if (previousNode == null && this.previous != null) {
            DoublyLinkedList<T> p = this.previous;
            this.previous = null;
            p.setNext(null);

            return;
        }

        this.previous = previousNode;

        if (previousNode != null && previousNode.getNext() != this) {
            previousNode.setNext(this);
        }
    }

    @Override
    public boolean isFirst() {
        return this.previous == null;
    }

    @Override
    public boolean isLast() {
        return this.next == null;
    }

    @Override
    public List<T> toList() {
        List<T> result = new ArrayList<>();
        DoublyLinkedList<T> node = this;

        while (node != null) {
            result.add(node.getData());
            node = node.getNext();
        }

        return result;
    }
}
