package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.BinaryNode;

/**
 * Implementation of {@link BinaryNode}.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public final class BinaryNodeImpl<T extends Comparable<T>>
        implements BinaryNode<T> {

    /**
     * Left node.
     */
    private BinaryNode<T> left;

    /**
     * Right node.
     */
    private BinaryNode<T> right;

    /**
     * Node's data.
     */
    private T data;

    /**
     * Constructor.
     *
     * @param dataValue node's data
     */
    public BinaryNodeImpl(final T dataValue) {
        this(null, null, dataValue);
    }

    /**
     * Constructor.
     *
     * @param leftNode left node
     * @param rightNode right node
     * @param dataValue node's data
     */
    public BinaryNodeImpl(final BinaryNode<T> leftNode,
                          final BinaryNode<T> rightNode,
                          final T dataValue) {
        this.left = leftNode;
        this.right = rightNode;
        this.data = dataValue;
    }

    @Override
    public BinaryNode<T> getLeft() {
        return left;
    }

    @Override
    public void setLeft(final BinaryNode<T> leftNode) {
        this.left = leftNode;
    }

    @Override
    public BinaryNode<T> getRight() {
        return right;
    }

    @Override
    public void setRight(final BinaryNode<T> rightNode) {
        this.right = rightNode;
    }

    @Override
    public T getData() {
        return data;
    }
}
