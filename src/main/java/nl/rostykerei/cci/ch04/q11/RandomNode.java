package nl.rostykerei.cci.ch04.q11;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

/**
 * Question 4.11 - Random Node.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface RandomNode<T extends Comparable<T>> extends BinaryTreeNode<T> {

    /**
     * Returns a random node from the tree.
     *
     * @return random node
     */
    RandomNode<T> getRandomNode();
}
