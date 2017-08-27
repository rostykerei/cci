package nl.rostykerei.cci.ch02.q05;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.5 - Sum Lists.
 *
 * @author Rosty Kerei
 */
public interface SumLists {

    /**
     * Adds two numbers represented as a list of reversed values.
     * Example: (7, 1, 6) + (5, 9, 2) = 617 + 295 = 912.
     *
     * @param l1 number one
     * @param l2 number two
     * @return sum
     */
    int sumListsReverse(LinkedListNode<Byte> l1, LinkedListNode<Byte> l2);

    /**
     * Adds two numbers represented as a list of values.
     * Example: (6, 1, 7) + (2, 9, 5) = 617 + 295 = 912.
     *
     * @param l1 number one
     * @param l2 number two
     * @return sum
     */
    int sumListsForward(LinkedListNode<Byte> l1, LinkedListNode<Byte> l2);
}
