package nl.rostykerei.cci.ch04.q02;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.2 - Minimal Tree.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface MinimalTree<T extends Comparable<T>> {

    /**
     * Creates a binary search tree with minimal height.
     *
     * @param input array of sorted values
     * @return binary search tree with minimal height
     */
    BinaryTreeNode<T> buildBST(T[] input);

}
