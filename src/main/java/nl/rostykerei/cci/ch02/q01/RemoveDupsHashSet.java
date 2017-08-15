package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.LinkedListNode;

import java.util.HashSet;

/**
 * Implementation of {@link RemoveDups} using a hash-set.
 *
 * @author Rosty Kerei
 */
public class RemoveDupsHashSet<T> implements RemoveDups<T> {

    @Override
    public void removeDups(LinkedListNode<T> input) {
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
