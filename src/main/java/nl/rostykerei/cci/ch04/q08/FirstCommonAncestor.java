package nl.rostykerei.cci.ch04.q08;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.8 - First Common Ancestor.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface FirstCommonAncestor<T extends Comparable<T>> {

    /**
     * Finds the first common ancestor of two nodes in a binary tree.
     *
     * @param node1 first node
     * @param node2 second node
     * @return common ancestor
     */
    BinaryTreeNode<T> findFirstCommonAncestor(
            BinaryTreeNode<T> node1,
            BinaryTreeNode<T> node2
    );
}
