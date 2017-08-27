package nl.rostykerei.cci.ch02.q07;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link Intersection}.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class IntersectionImpl<T> implements Intersection<T> {

    @Override
    public boolean isIntersect(final LinkedListNode<T> list1,
                               final LinkedListNode<T> list2) {

        LinkedListNode<T> l1 = list1;

        while (l1 != null) {
            LinkedListNode<T> l2 = list2;

            while (l2 != null) {

                if (l1 == l2) {
                    return true;
                }

                l2 = l2.getNext();
            }

            l1 = l1.getNext();
        }

        return false;
    }
}
