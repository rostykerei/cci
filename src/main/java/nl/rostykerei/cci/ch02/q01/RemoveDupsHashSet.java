package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;

import java.util.HashSet;

/**
 * Implementation of {@link RemoveDups} using a hash-set.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class RemoveDupsHashSet<T> implements RemoveDups<T> {

    @Override
    public void removeDups(final DoublyLinkedList<T> input) {
        HashSet<T> uniques = new HashSet<>();

        DoublyLinkedList<T> node = input;

        while (node != null) {
            if (!uniques.add(node.getData())) {
                node.getPrevious().setNext(node.getNext());
            }

            node = node.getNext();
        }
    }
}
