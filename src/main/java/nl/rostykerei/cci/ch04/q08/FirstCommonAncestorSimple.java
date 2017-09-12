package nl.rostykerei.cci.ch04.q08;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;
import nl.rostykerei.cci.datastructure.SinglyLinkedList;
import nl.rostykerei.cci.datastructure.impl.SinglyLinkedListImpl;

/**
 * Simplest solution to {@link FirstCommonAncestor}.
 *
 * @param <T> the class of the objects in the binary tree
 * @author Rosty Kerei
 */
public final class FirstCommonAncestorSimple<T extends Comparable<T>>
        implements FirstCommonAncestor<T> {

    @Override
    public BinaryTreeNode<T> findFirstCommonAncestor(
            final BinaryTreeNode<T> node1,
            final BinaryTreeNode<T> node2) {

        if (node1 == null || node2 == null) {
            return null;
        }

        SinglyLinkedList<BinaryTreeNode<T>> path1 = pathToTop(node1);
        SinglyLinkedList<BinaryTreeNode<T>> path2 = pathToTop(node2);

        if (path1 == null || path2 == null) {
            return null;
        }

        while (path1 != null) {

            SinglyLinkedList<BinaryTreeNode<T>> p2 = path2;

            while (p2 != null) {
                if (p2.getData().equals(path1.getData())) {
                    return p2.getData();
                }

                p2 = p2.getNext();
            }

            path1 = path1.getNext();
        }

        return null;
    }

    /**
     * Returns the path from node to the top.
     *
     * @param node source node
     * @return path as linked list
     */
    private SinglyLinkedList<BinaryTreeNode<T>> pathToTop(
            final BinaryTreeNode<T> node) {

        BinaryTreeNode<T> n = (BinaryTreeNode<T>) node.getParent();

        if (n == null) {
            return null;
        }

        SinglyLinkedList<BinaryTreeNode<T>> head =
                new SinglyLinkedListImpl<>(n);

        SinglyLinkedList<BinaryTreeNode<T>> tail = head;

        while (n != null) {
            SinglyLinkedList<BinaryTreeNode<T>> t =
                    new SinglyLinkedListImpl<>(n);

            tail.setNext(t);
            tail = t;

            n = (BinaryTreeNode<T>) n.getParent();
        }

        return head;
    }
}
