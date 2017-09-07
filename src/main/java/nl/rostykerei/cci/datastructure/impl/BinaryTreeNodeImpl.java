package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link BinaryTreeNode}.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public final class BinaryTreeNodeImpl<T extends Comparable<T>>
        extends TreeNodeImpl<T> implements BinaryTreeNode<T> {

    /**
     * Left node.
     */
    private BinaryTreeNode<T> left;

    /**
     * Right node.
     */
    private BinaryTreeNode<T> right;

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
        super(dataValue);
        this.setLeft(leftNode);
        this.setRight(rightNode);
    }

    @Override
    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    @Override
    public void setLeft(final BinaryTreeNode<T> leftNode) {
        this.left = leftNode;

        if (leftNode != null) {
            leftNode.setParent(this);
        }
    }

    @Override
    public BinaryTreeNode<T> getRight() {
        return right;
    }

    @Override
    public void setRight(final BinaryTreeNode<T> rightNode) {
        this.right = rightNode;

        if (rightNode != null) {
            rightNode.setParent(this);
        }
    }

    @Override
    public void addChild(final TreeNode<T> child) {
        throw new UnsupportedOperationException(
                "Use setLeft or setRight methods instead"
        );
    }

    @Override
    public List<TreeNode<T>> getChildren() {
        ArrayList<TreeNode<T>> result = new ArrayList<>();

        if (this.left != null) {
            result.add(this.left);
        }

        if (this.right != null) {
            result.add(right);
        }

        return result;
    }
}
