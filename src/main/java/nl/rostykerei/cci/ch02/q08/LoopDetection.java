package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.datastructure.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Question 2.8 - Loop Detection.
 *
 * @author Rosty Kerei
 */
public class LoopDetection {

    /**
     * Detects a circular linked list and returns the node at the beginning of the loop.
     *
     * @param list linked list
     * @return node at the beginning of the loop or null if there is no loop
     */
    public static <T> LinkedListNode<T> detectLoop(LinkedListNode<T> list) {
        Set<LinkedListNode<T>> set = new HashSet<>();

        while (list.getNext() != null) {
            if (!set.add(list)) {
                return list;
            }

            list = list.getNext();
        }

        return null;
    }
}
