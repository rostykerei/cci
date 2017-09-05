package nl.rostykerei.cci.ch04.q04;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Recursive implementation of {@link CheckBalanced}.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public final class CheckBalancedImpl<T extends Comparable<T>>
        implements CheckBalanced<T> {

    @Override
    public boolean checkBalanced(final BinaryTreeNode<T> input) {
        try {
            verifyNodeHeight(input);
            return true;
        } catch (HeightDifferenceException e) {
            return false;
        }
    }

    /**
     * Recursively calculates node's height.
     *
     * @param node input node
     * @return node height
     * @throws HeightDifferenceException if left and right heights differ
     *                                   by more than one
     */
    int verifyNodeHeight(final BinaryTreeNode<T> node)
            throws HeightDifferenceException {
        if (node == null) {
            return 0;
        }

        int leftHeight = verifyNodeHeight(node.getLeft());
        int rightHeight = verifyNodeHeight(node.getRight());

        if (Math.abs(leftHeight - rightHeight) > 1) {
            throw new HeightDifferenceException();
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * Height difference exception.
     */
    static class HeightDifferenceException extends Exception {

    }
}
