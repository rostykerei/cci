package nl.rostykerei.cci.ch04.q04;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.4 - Check Balanced.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface CheckBalanced<T extends Comparable<T>> {

    /**
     * Checks if the input binary tree is balanced, i.e. the heights of the two
     * subtrees of any node never differ by more than one.
     *
     * @param input tree to validate
     * @return true if the input tree is balanced, false otherwise
     */
    boolean checkBalanced(BinaryTreeNode<T> input);
}
