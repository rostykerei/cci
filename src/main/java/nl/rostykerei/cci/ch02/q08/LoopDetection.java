package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;

/**
 * Question 2.8 - Loop Detection.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface LoopDetection<T> {

    /**
     * Detects a circular linked list and returns the node at the beginning
     * of the loop.
     *
     * @param list linked list
     * @return node at the beginning of the loop or null if there is no loop
     */
    DoublyLinkedList<T> detectLoop(DoublyLinkedList<T> list);
}
