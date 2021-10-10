package nl.rostykerei.cci.datastructure;

import java.util.List;

/**
 * Directed graph node.
 *
 * @param <T> the class of the objects in the node
 * @author Rosty Kerei
 */
public interface TreeNode<T> {

    /**
     * Adds child node.
     *
     * @param child child node
     */
    void addChild(TreeNode<T> child);

    /**
     * Gets list of all children nodes.
     *
     * @return list of all children nodes
     */
    List<TreeNode<T>> getChildren();

    /**
     * Gets node's parent.
     *
     * @return parent node
     */
    TreeNode<T> getParent();

    /**
     * Sets node's parent.
     *
     * @param parent parent node
     */
    void setParent(TreeNode<T> parent);

    /**
     * Gets node's data.
     *
     * @return node's data
     */
    T getData();

}
