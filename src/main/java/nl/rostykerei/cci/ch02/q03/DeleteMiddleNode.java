package nl.rostykerei.cci.ch02.q03;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.3 - Delete Middle Node.
 *
 * @author Rosty Kerei
 */
public class DeleteMiddleNode {

    /**
     * Delete the node from list.
     *
     * @param node node to delete
     * @param <T>  the class of the objects in the list
     */
    public static <T> void deleteMiddleNode(LinkedListNode<T> node) {
        LinkedListNode<T> next = node.getNext();

        if (next == null) {
            throw new IllegalArgumentException("The last node cannot be deleted");
        }

        node.setData(next.getData());
        node.setNext(next.getNext());
    }
}
