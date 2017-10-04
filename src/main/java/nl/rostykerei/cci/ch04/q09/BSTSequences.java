package nl.rostykerei.cci.ch04.q09;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

import java.util.List;

/**
 * Question 4.9 - BST Sequences.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface BSTSequences<T extends Comparable<T>> {

    /**
     * Finds all possible arrays that could have led to the given tree.
     *
     * @param tree input binary search tree
     * @return list of arrays
     */
    List<T[]> findPossibleSequences(BinaryTreeNode<T> tree);

}
