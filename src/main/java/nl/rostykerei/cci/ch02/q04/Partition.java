package nl.rostykerei.cci.ch02.q04;

import nl.rostykerei.cci.datastructure.LinkedListNode;

public class Partition {

    public static <T extends Comparable<T>> LinkedListNode<T> partition(LinkedListNode<T> input, T x) {

        LinkedListNode<T> lowerHead = null;
        LinkedListNode<T> lowerTail = null;

        LinkedListNode<T> greaterHead = null;
        LinkedListNode<T> greaterTail = null;

        while (input != null) {
            LinkedListNode<T> node = new LinkedListNode<>(input.getData());

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

            input = input.getNext();
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
