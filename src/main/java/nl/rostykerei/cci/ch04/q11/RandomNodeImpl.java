package nl.rostykerei.cci.ch04.q11;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;

import java.util.Random;

/**
 * Implementation of {@link RandomNode}.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public final class RandomNodeImpl<T extends Comparable<T>>
        extends BinaryTreeNodeImpl<T> implements RandomNode<T> {

    /**
     * Randomise.
     */
    private static final Random RANDOM = new Random();

    /**
     * Node's constructor.
     *
     * @param dataValue node's value
     */
    public RandomNodeImpl(final T dataValue) {
        super(dataValue);
    }

    /**
     * Node's size.
     */
    private int size = 1;

    /**
     * Updates node's size.
     *
     * @param delta size delta
     */
    private void updateSize(final int delta) {
        size += delta;

        if (this.getParent() != null) {
            ((RandomNodeImpl) this.getParent()).updateSize(delta);
        }
    }

    @Override
    public void setLeft(final BinaryTreeNode<T> leftNode) {
        int dSize = 0;

        if (getLeft() != null) {
            dSize -= ((RandomNodeImpl) getLeft()).size;
        }

        super.setLeft(leftNode);

        if (leftNode != null) {
            dSize += ((RandomNodeImpl) leftNode).size;
        }

        if (dSize != 0) {
            updateSize(dSize);
        }
    }

    @Override
    public void setRight(final BinaryTreeNode<T> rightNode) {
        int dSize = 0;

        if (getRight() != null) {
            dSize -= ((RandomNodeImpl) getRight()).size;
        }

        super.setRight(rightNode);

        if (rightNode != null) {
            dSize += ((RandomNodeImpl) rightNode).size;
        }

        if (dSize != 0) {
            updateSize(dSize);
        }
    }

    /**
     * Traverse the node until limited length is reached.
     *
     * @param node root node
     * @param length desired length
     * @return {@link Tuple} with node and its length.
     */
    private Tuple traverse(final RandomNode<T> node, final int length) {
        if (node == null) {
            return new Tuple(length, null);
        }

        if (length == 0) {
            return new Tuple(0, node);
        }

        Tuple left = traverse((RandomNode<T>) node.getLeft(), length - 1);

        if (left.getNode() != null) {
            return left;
        }

        return traverse((RandomNode<T>) node.getRight(), left.getIndex());
    }

    @Override
    public RandomNode<T> getRandomNode() {
        int rand = RANDOM.nextInt(this.size);
        return traverse(this, rand).getNode();
    }

    /**
     * A tuple to hold both Node and index values.
     */
    private class Tuple {

        /**
         * Index.
         */
        private final int index;

        /**
         * Node.
         */
        private final RandomNode<T> node;

        /**
         * Tuple's constructor.
         *
         * @param indexValue index
         * @param nodeValue node
         */
        Tuple(final int indexValue, final RandomNode<T> nodeValue) {
            this.index = indexValue;
            this.node = nodeValue;
        }

        /**
         * Index getter.
         *
         * @return index value
         */
        int getIndex() {
            return index;
        }

        /**
         * Node's getter.
         *
         * @return node
         */
        RandomNode<T> getNode() {
            return node;
        }
    }
}
