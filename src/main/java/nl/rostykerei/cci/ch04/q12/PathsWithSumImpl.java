package nl.rostykerei.cci.ch04.q12;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Implementation of {@link PathsWithSum} by recursive functions.
 *
 * @author Rosty Kerei
 */
public final class PathsWithSumImpl implements PathsWithSum {

    @Override
    public int pathsWithSum(final BinaryTreeNode<Integer> tree,
                            final int sum) {
        if (tree == null) {
            return 0;
        }

        return calcPathsWithSum(tree, sum, 0)
                + pathsWithSum(tree.getLeft(), sum)
                + pathsWithSum(tree.getRight(), sum);
    }

    /**
     * Recursively calculates the number of path with the given sum.
     *
     * @param root      root node
     * @param targetSum target sum
     * @param pathSum   current path sum
     * @return number of paths with the given sum
     */
    private int calcPathsWithSum(
            final BinaryTreeNode<Integer> root,
            final int targetSum,
            final int pathSum) {

        if (root == null) {
            return 0;
        }

        int currentSum = pathSum + root.getData();

        int paths = calcPathsWithSum(root.getLeft(), targetSum, currentSum)
                + calcPathsWithSum(root.getRight(), targetSum, currentSum);

        if (currentSum == targetSum) {
            return paths + 1;
        }

        return paths;
    }
}
