package nl.rostykerei.cci.ch04.q05;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Implementation of {@link ValidateBST}.
 *
 * @param <T> the class of the objects in the tree
 */
public final class ValidateBSTImpl<T extends Comparable<T>>
        implements ValidateBST<T> {

    @Override
    public boolean isValidBST(final BinaryTreeNode<T> input) {
        return validateBSTNode(input, null, null);
    }

    /**
     * Recursively validate BST nodes.
     *
     * @param node root node
     * @param min  allowed minimum or null
     * @param max  allowed maximum or null
     * @return true if the node is a valid BST
     */
    private boolean validateBSTNode(final BinaryTreeNode<T> node,
                                    final T min, final T max) {
        return node == null
                || (min == null || node.getData().compareTo(min) >= 0)
                && (max == null || node.getData().compareTo(max) <= 0)
                && validateBSTNode(node.getLeft(), min, node.getData())
                && validateBSTNode(node.getRight(), node.getData(), max);
    }
}
