package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.1 - Remove Dups.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface RemoveDups<T> {

    /**
     * Removes duplicates from linked list.
     *
     * @param input linked list
     */
    void removeDups(LinkedListNode<T> input);
}
