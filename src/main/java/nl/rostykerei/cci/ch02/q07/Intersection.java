package nl.rostykerei.cci.ch02.q07;

import nl.rostykerei.cci.datastructure.SinglyLinkedList;

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
    boolean isIntersect(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2);

}
