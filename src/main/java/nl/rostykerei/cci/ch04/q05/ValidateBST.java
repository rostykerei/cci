package nl.rostykerei.cci.ch04.q05;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.5 - Validate BST.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface ValidateBST<T extends Comparable<T>> {

    /**
     * Validates if the input is a valid binary search tree.
     *
     * @param input tree to validate
     * @return true is the input is a valid BST, false otherwise
     */
    boolean isValidBST(BinaryTreeNode<T> input);

}
