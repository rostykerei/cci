package nl.rostykerei.cci.ch02.q04;

import nl.rostykerei.cci.datastructure.SinglyLinkedList;

/**
 * Question 2.4 - Partition.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface Partition<T extends Comparable<T>> {

    /**
     * Returns a list where beginning elements are less then x.
     *
     * @param input input list
     * @param x     value to compare
     * @return re-arranged, partitioned list
     */
    SinglyLinkedList<T> partition(SinglyLinkedList<T> input, T x);
}
