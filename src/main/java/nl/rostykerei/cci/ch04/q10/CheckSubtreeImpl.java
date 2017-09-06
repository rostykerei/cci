package nl.rostykerei.cci.ch04.q10;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Implementation of {@link CheckSubtree} using DFS and
 * recursive tree comparision.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public final class CheckSubtreeImpl<T extends Comparable<T>>
        implements CheckSubtree<T> {

    @Override
    public boolean isSubtree(final BinaryTreeNode<T> tree,
                             final BinaryTreeNode<T> subtree) {

        return tree != null
                && (treeEquals(tree, subtree)
                || isSubtree(tree.getRight(), subtree)
                || isSubtree(tree.getLeft(), subtree));

    }

    /**
     * Compares two binary trees by data value.
     *
     * @param t1 first tree
     * @param t2 second tree
     * @return true if trees equal by data value
     */
    public boolean treeEquals(final BinaryTreeNode<T> t1,
                              final BinaryTreeNode<T> t2) {
        return t1 == t2
                || t1 != null
                && t2 != null
                && t1.getData().equals(t2.getData())
                && treeEquals(t1.getLeft(), t2.getLeft())
                && treeEquals(t1.getRight(), t2.getRight());
    }
}
