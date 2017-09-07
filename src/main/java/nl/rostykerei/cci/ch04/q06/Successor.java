package nl.rostykerei.cci.ch04.q06;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.6 - Successor.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface Successor<T extends Comparable<T>> {

    /**
     * Finds the next node (in-order successor) of a given node in
     * a binary search tree.
     *
     * @param input
     * @return
     */
    BinaryTreeNode<T> findNext(BinaryTreeNode<T> input);
}
