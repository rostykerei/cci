package nl.rostykerei.cci.ch04.q11;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.Pair;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;
import nl.rostykerei.cci.datastructure.impl.PairImpl;

import java.security.SecureRandom;
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
    private static final Random RANDOM = new SecureRandom();

    /**
     * Node's size.
     */
    private int size = 1;

    /**
     * Node's constructor.
     *
     * @param dataValue node's value
     */
    public RandomNodeImpl(final T dataValue) {
        super(dataValue);
    }

    /**
     * Updates node's size.
     *
     * @param delta size delta
     */
    private void updateSize(final int delta) {
        size += delta;

        if (this.getParent() != null) {
            ((RandomNodeImpl<T>) this.getParent()).updateSize(delta);
        }
    }

    @Override
    public void setLeft(final BinaryTreeNode<T> leftNode) {
        int dSize = 0;

        if (getLeft() != null) {
            dSize -= ((RandomNodeImpl<T>) getLeft()).size;
        }

        super.setLeft(leftNode);

        if (leftNode != null) {
            dSize += ((RandomNodeImpl<T>) leftNode).size;
        }

        if (dSize != 0) {
            updateSize(dSize);
        }
    }

    @Override
    public void setRight(final BinaryTreeNode<T> rightNode) {
        int dSize = 0;

        if (getRight() != null) {
            dSize -= ((RandomNodeImpl<T>) getRight()).size;
        }

        super.setRight(rightNode);

        if (rightNode != null) {
            dSize += ((RandomNodeImpl<T>) rightNode).size;
        }

        if (dSize != 0) {
            updateSize(dSize);
        }
    }

    /**
     * Traverse the node until limited length is reached.
     *
     * @param node   root node
     * @param length desired length
     * @return {@link Pair} of node and its length.
     */
    private Pair<Integer, RandomNode<T>> traverse(
            final RandomNode<T> node,
            final int length) {

        if (node == null) {
            return new PairImpl<>(length, null);
        }

        if (length == 0) {
            return new PairImpl<>(0, node);
        }

        Pair<Integer, RandomNode<T>> left = traverse(
                (RandomNode<T>) node.getLeft(),
                length - 1);

        if (left.getSecond() != null) {
            return left;
        }

        return traverse((RandomNode<T>) node.getRight(), left.getFirst());
    }

    @Override
    public RandomNode<T> getRandomNode() {
        int rand = RANDOM.nextInt(this.size);
        return traverse(this, rand).getSecond();
    }
}
