package nl.rostykerei.cci.ch02.q02;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.2 - Return Kth to Last.
 *
 * @author Rosty Kerei;
 */
public class KthToLast {

    /**
     * Returns k-th node to the last one.
     *
     * @param list input list
     * @param k    index to the last
     * @param <T>  the class of the objects in the list
     * @return k-th node to the last one
     */
    public static <T> LinkedListNode<T> kthToLast(LinkedListNode<T> list, int k) {

        LinkedListNode<T> left = list;
        LinkedListNode<T> right = list;

        int i = 0;
        while (right != null) {
            if (i > k) {
                left = left.getNext();
            }

            right = right.getNext();
            i++;
        }

        return i > k ? left : null;
    }

}
