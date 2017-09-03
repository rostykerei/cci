package nl.rostykerei.cci.ch04.q01;

import nl.rostykerei.cci.datastructure.TreeNode;

/**
 * Question 4.1 - Route Between Nodes.
 *
 * @param <T> the class of the objects in the graph
 * @author Rosty Kerei
 */
public interface RouteBetweenNodes<T> {

    /**
     * Checks if route exists between two nodes in a directed graph.
     *
     * @param start start node
     * @param finish finish node
     * @return true if route exists
     */
    boolean isRoutePossible(TreeNode<T> start, TreeNode<T> finish);

}
