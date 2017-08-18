package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.datastructure.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link LoopDetection} using a hash-set.
 *
 * @author Rosty Kerei
 */
public class LoopDetectionHashSet<T> implements LoopDetection<T> {

    @Override
    public LinkedListNode<T> detectLoop(LinkedListNode<T> list) {
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
