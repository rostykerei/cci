package nl.rostykerei.cci.ch02.q07;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.7 - Intersection.
 *
 * @author Rosty Kerei
 */
public class Intersection {

    /**
     * Checks if two lists intersect
     *
     * @param list1 first singly-linked list
     * @param list2 second singly-linked list
     * @param <T>   the class of the objects in the list
     * @return <code>true</code> is lists intersect, <code>false</code> otherwise
     */
    public static <T> boolean isIntersect(LinkedListNode<T> list1, LinkedListNode<T> list2) {
        while (list1 != null) {
            LinkedListNode<T> l2 = list2;

            while (l2 != null) {

                if (list1 == l2) {
                    return true;
                }

                l2 = l2.getNext();
            }

            list1 = list1.getNext();
        }

        return false;
    }
}
