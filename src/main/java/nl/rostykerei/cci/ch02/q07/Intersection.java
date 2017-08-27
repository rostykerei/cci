package nl.rostykerei.cci.ch02.q07;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.7 - Intersection.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface Intersection<T> {

    /**
     * Checks if two lists intersect.
     *
     * @param list1 first singly-linked list
     * @param list2 second singly-linked list
     * @return true is lists intersect, false otherwise
     */
    boolean isIntersect(LinkedListNode<T> list1, LinkedListNode<T> list2);

}
