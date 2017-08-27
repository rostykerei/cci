package nl.rostykerei.cci.ch02.q03;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link DeleteMiddleNode}.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class DeleteMiddleNodeImpl<T> implements DeleteMiddleNode<T> {

    @Override
    public void deleteMiddleNode(final LinkedListNode<T> node) {
        LinkedListNode<T> next = node.getNext();

        if (next == null) {
            throw new IllegalArgumentException(
                    "The last node cannot be deleted"
            );
        }

        node.setData(next.getData());
        node.setNext(next.getNext());
    }
}
