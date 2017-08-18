package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link LoopDetection} using a back runner loop.
 *
 * @author Rosty Kerei
 */
public class LoopDetectionBackrunner<T> implements LoopDetection<T> {

    @Override
    public LinkedListNode<T> detectLoop(LinkedListNode<T> list) {
        while (list.getNext() != null) {
            LinkedListNode<T> r = list.getPrevious();

            while (r != null) {
                if (r.equals(list)) {
                    return r;
                }

                r = r.getPrevious();
            }


            list = list.getNext();
        }

        return null;
    }
}
