package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link RemoveDups} using a runner.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class RemoveDupsRunner<T> implements RemoveDups<T> {

    @Override
    public void removeDups(final LinkedListNode<T> input) {
        LinkedListNode<T> node = input;

        while (node != null) {
            T value = node.getData();

            LinkedListNode<T> runner = node.getNext();

            while (runner != null) {
                if (runner.getData().equals(value)) {
                    runner.getPrevious().setNext(runner.getNext());
                }

                runner = runner.getNext();
            }

            node = node.getNext();
        }
    }
}
