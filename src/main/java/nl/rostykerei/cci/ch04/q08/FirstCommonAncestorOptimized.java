package nl.rostykerei.cci.ch04.q08;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Optimized solution to {@link FirstCommonAncestor}.
 *
 * @param <T> the class of the objects in the binary tree
 * @author Rosty Kerei
 */
public final class FirstCommonAncestorOptimized<T extends Comparable<T>>
        implements FirstCommonAncestor<T> {

    @Override
    public BinaryTreeNode<T> findFirstCommonAncestor(
            final BinaryTreeNode<T> node1,
            final BinaryTreeNode<T> node2) {

        if (node1 == null || node2 == null) {
            return null;
        }

        BinaryTreeNode<T> p1 = (BinaryTreeNode<T>) node1.getParent();
        BinaryTreeNode<T> p2 = (BinaryTreeNode<T>) node2.getParent();

        if (p1 == null || p2 == null) {
            return null;
        }

        int node1Depth = findDepth(p1);
        int node2Depth = findDepth(p2);

        BinaryTreeNode<T> shortTree;
        BinaryTreeNode<T> longTree;

        if (node1Depth > node2Depth) {
            shortTree = p2;
            longTree = p1;
        } else {
            shortTree = p1;
            longTree = p2;
        }

        // Skip long levels
        for (int i = 0; i < Math.abs(node1Depth - node2Depth); i++) {
            longTree = (BinaryTreeNode<T>) longTree.getParent();
        }

        while (shortTree != null) {
            if (shortTree.equals(longTree)) {
                return shortTree;
            }

            shortTree = (BinaryTreeNode<T>) shortTree.getParent();
            longTree = (BinaryTreeNode<T>) longTree.getParent();
        }

        return null;
    }

    /**
     * Calculates node's depth.
     *
     * @param node given node
     * @return number of levels to the top
     */
    private int findDepth(final BinaryTreeNode<T> node) {
        int depth = 0;

        BinaryTreeNode<T> n = node;
        while (n != null) {
            depth++;
            n = (BinaryTreeNode<T>) n.getParent();
        }

        return depth;
    }

}
