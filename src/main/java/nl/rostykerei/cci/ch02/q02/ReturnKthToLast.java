package nl.rostykerei.cci.ch02.q02;

import nl.rostykerei.cci.datastructure.SinglyLinkedList;

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
    SinglyLinkedList<T> kthToLast(SinglyLinkedList<T> list, int k);
}
