package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.LinkedList;

/**
 * Abstract linked list. Just holds the data.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public abstract class AbstractLinkedList<T> implements LinkedList<T> {

    /**
     * Data holder.
     */
    private T data;

    @Override
    public final T getData() {
        return this.data;
    }

    @Override
    public final void setData(final T value) {
        this.data = value;

    }
}
