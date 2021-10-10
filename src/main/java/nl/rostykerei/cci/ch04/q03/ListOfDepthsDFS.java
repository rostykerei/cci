package nl.rostykerei.cci.ch04.q03;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementation of {@link ListOfDepths} using depth-first search.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public final class ListOfDepthsDFS<T extends Comparable<T>>
        implements ListOfDepths<T> {

    @Override
    public List<LinkedList<BinaryTreeNode<T>>> getListOfDepth(
            final BinaryTreeNode<T> input) {

        List<LinkedList<BinaryTreeNode<T>>> result = new ArrayList<>();

        dfs(input, 0, result);

        return result;
    }

    /**
     * Recursive depth-first search.
     *
     * @param node   current node
     * @param level  current level
     * @param result resulting list of lists
     */
    private void dfs(final BinaryTreeNode<T> node,
                     final int level,
                     final List<LinkedList<BinaryTreeNode<T>>> result) {

        if (result.size() < level + 1) {
            result.add(new LinkedList<>());
        }

        result.get(level).add(node);

        if (node.getLeft() != null) {
            dfs(node.getLeft(), level + 1, result);
        }

        if (node.getRight() != null) {
            dfs(node.getRight(), level + 1, result);
        }
    }
}
