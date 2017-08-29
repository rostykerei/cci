package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;

/**
 * Implementation of {@link RemoveDups} using a runner.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class RemoveDupsRunner<T> implements RemoveDups<T> {

    @Override
    public void removeDups(final DoublyLinkedList<T> input) {
        DoublyLinkedList<T> node = input;

        while (node != null) {
            T value = node.getData();

            DoublyLinkedList<T> runner = node.getNext();

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
