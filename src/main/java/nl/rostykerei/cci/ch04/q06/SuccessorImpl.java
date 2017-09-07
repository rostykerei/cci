package nl.rostykerei.cci.ch04.q06;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Implementation of {@link Successor}.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public final class SuccessorImpl<T extends Comparable<T>>
        implements Successor<T> {

    @Override
    public BinaryTreeNode<T> findNext(final BinaryTreeNode<T> node) {
        if (node.getRight() != null) {
            BinaryTreeNode<T> n = node.getRight();

            while (n.getLeft() != null) {
                n = n.getLeft();
            }

            return n;
        } else {
            BinaryTreeNode<T> n = node;
            BinaryTreeNode<T> parent = (BinaryTreeNode<T>) node.getParent();

            while (parent != null && parent.getLeft() != n) {
                n = parent;
                parent = (BinaryTreeNode<T>) parent.getParent();
            }

            return parent;
        }
    }
}
