package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.LinkedListNode;

import java.util.HashSet;

/**
 * Implementation of {@link RemoveDups} using a hash-set.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class RemoveDupsHashSet<T> implements RemoveDups<T> {

    @Override
    public void removeDups(final LinkedListNode<T> input) {
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
