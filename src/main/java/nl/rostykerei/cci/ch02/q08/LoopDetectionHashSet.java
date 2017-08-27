package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.datastructure.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link LoopDetection} using a hash-set.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class LoopDetectionHashSet<T> implements LoopDetection<T> {

    @Override
    public LinkedListNode<T> detectLoop(final LinkedListNode<T> list) {
        Set<LinkedListNode<T>> set = new HashSet<>();

        LinkedListNode<T> head = list;

        while (head.getNext() != null) {
            if (!set.add(head)) {
                return head;
            }

            head = head.getNext();
        }

        return null;
    }
}
