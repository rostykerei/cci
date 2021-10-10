package nl.rostykerei.cci.ch02.q02;

import nl.rostykerei.cci.datastructure.SinglyLinkedList;

/**
 * Implementation of {@link ReturnKthToLast}.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class ReturnKthToLastImpl<T> implements ReturnKthToLast<T> {

    @Override
    public SinglyLinkedList<T> kthToLast(final SinglyLinkedList<T> list,
                                         final int k) {

        SinglyLinkedList<T> left = list;
        SinglyLinkedList<T> right = list;

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
