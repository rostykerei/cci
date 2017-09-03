package nl.rostykerei.cci.ch04.q01;

import nl.rostykerei.cci.datastructure.Queue;
import nl.rostykerei.cci.datastructure.TreeNode;
import nl.rostykerei.cci.datastructure.impl.QueueImpl;

import java.util.HashSet;

/**
 * Implementation of {@link RouteBetweenNodes} using breadth-first search.
 *
 * @param <T> the class of the objects in the graph
 * @author Rosty Kerei
 */
public final class RouteBetweenNodesBSF<T> implements RouteBetweenNodes<T> {

    @Override
    public boolean isRoutePossible(final TreeNode<T> start,
                                   final TreeNode<T> finish) {

        HashSet<TreeNode<T>> seen = new HashSet<>();
        seen.add(start);

        Queue<TreeNode<T>> queue = new QueueImpl<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            TreeNode<T> currentNode = queue.remove();

            if (currentNode == finish) {
                return true;
            }

            for (TreeNode<T> child : currentNode.getChildren()) {
                if (!seen.contains(child)) {
                    seen.add(child);
                    queue.add(child);
                }
            }
        }

        return false;
    }
}
