package nl.rostykerei.cci.ch02.q05;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link SumLists}.
 *
 * @author Rosty Kerei
 */
public final class SumListsImpl implements SumLists {

    /**
     * Number 10.
     */
    private static final int TEN_BASE = 10;

    @Override
    public int sumListsReverse(final LinkedListNode<Byte> l1,
                               final LinkedListNode<Byte> l2) {
        return listToNumberReverse(l1) + listToNumberReverse(l2);
    }

    @Override
    public int sumListsForward(final LinkedListNode<Byte> l1,
                               final LinkedListNode<Byte> l2) {
        return listToNumberForward(l1) + listToNumberForward(l2);
    }

    /**
     * Converts a list of integers (in reverse order) to number.
     *
     * @param input input list
     * @return integer
     */
    private static int listToNumberReverse(final LinkedListNode<Byte> input) {
        int result = 0;
        int exp = 0;

        LinkedListNode<Byte> list = input;
        while (list != null) {
            result += Math.pow(TEN_BASE, exp) * list.getData();

            exp++;
            list = list.getNext();
        }

        return result;
    }

    /**
     * Converts a list of integers (in reverse order) to number.
     *
     * @param input input list
     * @return integer
     */
    private static int listToNumberForward(final LinkedListNode<Byte> input) {
        int result = 0;
        int exp = 0;

        LinkedListNode<Byte> list = input;
        while (list.getNext() != null) {
            list = list.getNext();
        }

        while (list != null) {
            result += Math.pow(TEN_BASE, exp) * list.getData();

            exp++;
            list = list.getPrevious();
        }

        return result;
    }

}
