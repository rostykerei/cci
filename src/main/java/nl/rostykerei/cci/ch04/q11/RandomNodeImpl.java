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

    @Override
    public BinaryTreeNode<T> getRandomNode() {
        int randMax = 1;

        if (this.getLeft() != null) {
            randMax++;
        }

        if (this.getRight() != null) {
            randMax++;
        }

        if (randMax == 1) {
            return this;
        }

        int rand = RANDOM.nextInt(randMax);

        if (rand == 0) {
            return this;
        }

        if (rand == 1) {
            if (this.getLeft() != null) {
                return ((RandomNode<T>) this.getLeft()).getRandomNode();
            } else {
                return ((RandomNode<T>) this.getRight()).getRandomNode();
            }
        }

        return ((RandomNode<T>) this.getRight()).getRandomNode();
    }
}
