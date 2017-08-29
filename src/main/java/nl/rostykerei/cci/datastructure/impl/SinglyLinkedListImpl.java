package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Singly-linked list implementation.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class SinglyLinkedListImpl<T>
        extends AbstractLinkedList<T> implements SinglyLinkedList<T> {

    /**
     * Link to the next node.
     */
    private SinglyLinkedList<T> next;

    /**
     * Constructor.
     *
     * @param value node data value
     */
    public SinglyLinkedListImpl(final T value) {
        this.setData(value);
    }

    @Override
    public SinglyLinkedList<T> setNext(final SinglyLinkedList<T> nextNode) {
        this.next = nextNode;
        return this;
    }

    @Override
    public SinglyLinkedList<T> getNext() {
        return this.next;
    }

    @Override
    public boolean isLast() {
        return this.next == null;
    }

    @Override
    public List<T> toList() {
        List<T> result = new ArrayList<>();
        SinglyLinkedList<T> node = this;

        while (node != null) {
            result.add(node.getData());
            node = node.getNext();
        }

        return result;
    }
}
