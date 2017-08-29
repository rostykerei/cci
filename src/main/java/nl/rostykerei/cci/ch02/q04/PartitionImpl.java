package nl.rostykerei.cci.ch02.q04;

import nl.rostykerei.cci.datastructure.SinglyLinkedList;
import nl.rostykerei.cci.datastructure.impl.SinglyLinkedListImpl;

/**
 * Implementation of {@link Partition}.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class PartitionImpl<T extends Comparable<T>>
        implements Partition<T> {

    @Override
    public SinglyLinkedList<T> partition(final SinglyLinkedList<T> input,
                                         final T x) {

        SinglyLinkedList<T> list = input;

        SinglyLinkedList<T> lowerHead = null;
        SinglyLinkedList<T> lowerTail = null;

        SinglyLinkedList<T> greaterHead = null;
        SinglyLinkedList<T> greaterTail = null;

        while (list != null) {
            SinglyLinkedList<T> node =
                    new SinglyLinkedListImpl<>(list.getData());

            if (node.getData().compareTo(x) < 0) {
                if (lowerHead == null) {
                    lowerHead = node;
                    lowerTail = lowerHead;
                } else {
                    lowerTail.setNext(node);
                    lowerTail = node;
                }
            } else {
                if (greaterHead == null) {
                    greaterHead = node;
                    greaterTail = greaterHead;
                } else {
                    greaterTail.setNext(node);
                    greaterTail = node;
                }
            }

            list = list.getNext();
        }

        if (lowerHead == null) {
            return greaterHead;
        }

        if (greaterHead == null) {
            return lowerHead;
        }

        lowerTail.setNext(greaterHead);

        return lowerHead;
    }
}
