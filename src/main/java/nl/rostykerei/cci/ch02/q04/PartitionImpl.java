package nl.rostykerei.cci.ch02.q04;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link Partition}.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class PartitionImpl<T extends Comparable<T>>
        implements Partition<T> {

    @Override
    public LinkedListNode<T> partition(final LinkedListNode<T> input,
                                       final T x) {

        LinkedListNode<T> list = input;

        LinkedListNode<T> lowerHead = null;
        LinkedListNode<T> lowerTail = null;

        LinkedListNode<T> greaterHead = null;
        LinkedListNode<T> greaterTail = null;

        while (list != null) {
            LinkedListNode<T> node = new LinkedListNode<>(list.getData());

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
