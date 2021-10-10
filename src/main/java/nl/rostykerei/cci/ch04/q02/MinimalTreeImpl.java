package nl.rostykerei.cci.ch04.q02;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.impl.BinaryTreeNodeImpl;

/**
 * Implementation of {@link MinimalTree}.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public final class MinimalTreeImpl<T extends Comparable<T>>
        implements MinimalTree<T> {

    @Override
    public BinaryTreeNode<T> buildBST(final T[] input) {
        return buildNode(input, 0, input.length - 1);
    }

    /**
     * Recursive function to build binary search tree node.
     *
     * @param input sorted array of values
     * @param left  left boundary
     * @param right right boundary
     * @return binary search tree node
     */
    private BinaryTreeNode<T> buildNode(final T[] input,
                                        final int left,
                                        final int right) {
        if (left < right) {
            int midPoint = left + (right - left) / 2;

            return new BinaryTreeNodeImpl<>(
                    buildNode(input, left, midPoint - 1),
                    buildNode(input, midPoint + 1, right),
                    input[midPoint]
            );
        } else if (left == right) {
            return new BinaryTreeNodeImpl<>(input[left]);
        } else {
            return null;
        }
    }
}
