package nl.rostykerei.cci.datastructure;

import java.util.List;

/**
 * Directed graph node.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public interface Node<T> {

    /**
     * Adds child node.
     *
     * @param child child node
     */
    void addChild(Node<T> child);

    /**
     * Gets list of all children nodes.
     *
     * @return list of all children nodes
     */
    List<Node<T>> getChildren();

    /**
     * Gets node's data.
     *
     * @return node's data
     */
    T getData();

}
