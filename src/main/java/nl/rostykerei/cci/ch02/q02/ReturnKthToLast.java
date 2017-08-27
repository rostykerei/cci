package nl.rostykerei.cci.ch02.q02;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.2 - Return Kth to Last.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface ReturnKthToLast<T> {

    /**
     * Returns k-th node to the last one.
     *
     * @param list input list
     * @param k    index to the last
     * @return k-th node to the last one
     */
    LinkedListNode<T> kthToLast(LinkedListNode<T> list, int k);
}
