package nl.rostykerei.cci.ch04.q08;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Recursive solution to {@link FirstCommonAncestor}.
 *
 * @param <T> the class of the objects in the binary tree
 * @author Rosty Kerei
 */
public final class FirstCommonAncestorRecursive<T extends Comparable<T>>
        implements FirstCommonAncestor<T> {

    @Override
    public BinaryTreeNode<T> findFirstCommonAncestor(
            final BinaryTreeNode<T> node1,
            final BinaryTreeNode<T> node2) {

        if (node1 == null || node2 == null) {
            return null;
        }

        if (contains(node1, node2)) {
            return (BinaryTreeNode<T>) node1.getParent();
        }

        if (contains(node2, node1)) {
            return (BinaryTreeNode<T>) node2.getParent();
        }

        BinaryTreeNode<T> previous = node1;
        BinaryTreeNode<T> parent = (BinaryTreeNode<T>) node1.getParent();

        while (parent != null) {
            if (previous == parent.getLeft()
                    && contains(parent.getRight(), node2)) {
                return parent;
            }

            if (previous == parent.getRight()
                    && contains(parent.getLeft(), node2)) {
                return parent;
            }

            previous = parent;
            parent = (BinaryTreeNode<T>) parent.getParent();
        }

        return null;
    }


    /**
     * Checks if root contains subtree.
     *
     * @param root    root node
     * @param subtree node to search
     * @return true if root node is a parent or equals to subtree
     */
    private boolean contains(
            final BinaryTreeNode<T> root,
            final BinaryTreeNode<T> subtree) {
        return root != null
                && (root == subtree
                || contains(root.getLeft(), subtree)
                || contains(root.getRight(), subtree));
    }

}
