package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Implementation of {@link BinaryTreeNode}.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public final class BinaryTreeNodeImpl<T extends Comparable<T>>
        implements BinaryTreeNode<T> {

    /**
     * Left node.
     */
    private BinaryTreeNode<T> left;

    /**
     * Right node.
     */
    private BinaryTreeNode<T> right;

    /**
     * Node's data.
     */
    private T data;

    /**
     * Constructor.
     *
     * @param dataValue node's data
     */
    public BinaryTreeNodeImpl(final T dataValue) {
        this(null, null, dataValue);
    }

    /**
     * Constructor.
     *
     * @param leftNode left node
     * @param rightNode right node
     * @param dataValue node's data
     */
    public BinaryTreeNodeImpl(final BinaryTreeNode<T> leftNode,
                              final BinaryTreeNode<T> rightNode,
                              final T dataValue) {
        this.left = leftNode;
        this.right = rightNode;
        this.data = dataValue;
    }

    @Override
    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    @Override
    public void setLeft(final BinaryTreeNode<T> leftNode) {
        this.left = leftNode;
    }

    @Override
    public BinaryTreeNode<T> getRight() {
        return right;
    }

    @Override
    public void setRight(final BinaryTreeNode<T> rightNode) {
        this.right = rightNode;
    }

    @Override
    public T getData() {
        return data;
    }
}
