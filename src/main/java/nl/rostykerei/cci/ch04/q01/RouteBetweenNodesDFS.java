package nl.rostykerei.cci.ch04.q01;

import nl.rostykerei.cci.datastructure.Node;

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
    public boolean isRoutePossible(final Node<T> start, final Node<T> finish) {
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
    private boolean dfs(final Node<T> node, final Node<T> finish,
                        final Set<Node> seen) {

        if (node == finish) {
            return true;
        }

        seen.add(node);

        for (Node<T> n : node.getChildren()) {
            if (!seen.contains(n) && dfs(n, finish, seen)) {
                return true;
            }
        }

        return false;
    }
}
