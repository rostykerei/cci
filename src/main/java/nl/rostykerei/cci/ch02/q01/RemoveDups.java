package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.LinkedListNode;

import java.util.HashSet;

/**
 * Question 2.1 - Remove Dups.
 *
 * @author Rosty Kerei
 */
public class RemoveDups {

    /**
     * Removes duplicates from linked list
     *
     * @param input linked list
     */
    public static <T> void removeDups(LinkedListNode<T> input) {
        HashSet<T> uniques = new HashSet<>();

        LinkedListNode<T> node = input;

        while (node != null) {
            if (!uniques.add(node.getData())) {
                node.getPrevious().setNext(node.getNext());
            }

            node = node.getNext();
        }
    }

}
