package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link TreeNode}.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public class TreeNodeImpl<T> implements TreeNode<T> {

    /**
     * Data holder.
     */
    private final T data;

    /**
     * List of all children nodes.
     */
    private final List<TreeNode<T>> children = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param dataValue node's data
     */
    public TreeNodeImpl(final T dataValue) {
        this.data = dataValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addChild(final TreeNode<T> child) {
        children.add(child);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<TreeNode<T>> getChildren() {
        return children;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T getData() {
        return data;
    }


}
