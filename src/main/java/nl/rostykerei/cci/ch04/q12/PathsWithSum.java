package nl.rostykerei.cci.ch04.q12;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.12 - Paths with Sum.
 *
 * @author Rosty Kerei
 */
public interface PathsWithSum {

    /**
     * Counts the number of paths that sum to a given value.
     *
     * @param tree input tree
     * @param sum sum to find
     * @return number of paths with the given sum
     */
    int pathsWithSum(BinaryTreeNode<Integer> tree, int sum);

}
