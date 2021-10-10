package nl.rostykerei.cci.ch04.q10;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.10 - Check Subtree.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface CheckSubtree<T extends Comparable<T>> {

    /**
     * Checks if the subtree subtrees the tree. Compares by node values.
     *
     * @param tree    tree
     * @param subtree subtree
     * @return true if subtree subtrees the tree
     */
    boolean isSubtree(BinaryTreeNode<T> tree, BinaryTreeNode<T> subtree);

}
