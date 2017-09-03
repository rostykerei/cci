package nl.rostykerei.cci.datastructure;

/**
 * Binary tree node.
 *
 * @param <T> the class of the objects in the node.
 * @author Rosty Kerei
 */
public interface BinaryNode<T extends Comparable<T>> {

    /**
     * Gets left node.
     *
     * @return left node
     */
    BinaryNode<T> getLeft();

    /**
     * Sets left node.
     *
     * @param leftNode left node
     */
    void setLeft(BinaryNode<T> leftNode);

    /**
     * Gets right node.
     *
     * @return right node
     */
    BinaryNode<T> getRight();

    /**
     * Sets right node.
     *
     * @param rightNode right node
     */
    void setRight(BinaryNode<T> rightNode);

    /**
     * Gets node's data.
     *
     * @return node's data
     */
    T getData();

}
