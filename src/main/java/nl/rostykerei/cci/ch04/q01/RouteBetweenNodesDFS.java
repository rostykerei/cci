package nl.rostykerei.cci.ch04.q01;

import nl.rostykerei.cci.datastructure.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link RouteBetweenNodes} using depth-first search.
 *
 * @param <T> the class of the objects in the graph
 * @author Rosty Kerei
 */
public final class RouteBetweenNodesDFS<T> implements RouteBetweenNodes<T> {

    @Override
    public boolean isRoutePossible(final TreeNode<T> start,
                                   final TreeNode<T> finish) {
        return dfs(start, finish, new HashSet<>());
    }

    /**
     * Recursive depth-first search.
     *
     * @param node current node
     * @param finish finish node
     * @param seen set of seen nodes
     * @return true if route can be found, false otherwise
     */
    private boolean dfs(final TreeNode<T> node, final TreeNode<T> finish,
                        final Set<TreeNode> seen) {

        if (node.equals(finish)) {
            return true;
        }

        seen.add(node);

        for (TreeNode<T> child : node.getChildren()) {
            if (!seen.contains(child) && dfs(child, finish, seen)) {
                return true;
            }
        }

        return false;
    }
}
