package nl.rostykerei.cci.ch02.q02;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link ReturnKthToLast}.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class ReturnKthToLastImpl<T> implements ReturnKthToLast<T> {

    @Override
    public LinkedListNode<T> kthToLast(final LinkedListNode<T> list,
                                       final int k) {

        LinkedListNode<T> left = list;
        LinkedListNode<T> right = list;

        int i = 0;
        while (right != null) {
            if (i > k) {
                left = left.getNext();
            }

            right = right.getNext();
            i++;
        }

        if (i > k) {
            return left;
        }

        return null;
    }

}
