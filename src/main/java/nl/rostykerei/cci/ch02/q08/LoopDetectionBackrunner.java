package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link LoopDetection} using a back runner loop.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class LoopDetectionBackrunner<T> implements LoopDetection<T> {

    @Override
    public LinkedListNode<T> detectLoop(final LinkedListNode<T> list) {
        LinkedListNode<T> head = list;

        while (head.getNext() != null) {
            LinkedListNode<T> r = head.getPrevious();

            while (r != null) {
                if (r.equals(head)) {
                    return r;
                }

                r = r.getPrevious();
            }


            head = head.getNext();
        }

        return null;
    }
}
