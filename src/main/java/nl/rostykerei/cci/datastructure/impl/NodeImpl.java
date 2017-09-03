package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link Node}.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public final class NodeImpl<T> implements Node<T> {

    /**
     * Data holder.
     */
    private T data;

    /**
     * List of all children nodes.
     */
    private List<Node<T>> children = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param dataValue node's data
     */
    public NodeImpl(final T dataValue) {
        this.data = dataValue;
    }

    @Override
    public void addChild(final Node<T> child) {
        children.add(child);
    }

    @Override
    public List<Node<T>> getChildren() {
        return children;
    }

    @Override
    public T getData() {
        return data;
    }


}
