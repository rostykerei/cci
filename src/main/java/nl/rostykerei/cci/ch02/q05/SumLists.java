package nl.rostykerei.cci.ch02.q05;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.5 - Sum Lists.
 *
 * @author Rosty Kerei
 */
public class SumLists {

    /**
     * Adds two numbers represented as a list of reversed values.
     * Example: (7 -> 1 -> 6) + (5 -> 9 -> 2) = 617 + 295 = 912.
     *
     * @param l1 number one
     * @param l2 number two
     * @return sum
     */
    public static int sumListsReverse(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2) {
        return listToNumberReverse(l1) + listToNumberReverse(l2);
    }


    /**
     * Adds two numbers represented as a list of values.
     * Example: (6 -> 1 -> 7) + (2 -> 9 -> 5) = 617 + 295 = 912.
     *
     * @param l1 number one
     * @param l2 number two
     * @return sum
     */
    public static int sumListsForward(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2) {
        return listToNumberForward(l1) + listToNumberForward(l2);
    }

    private static int listToNumberReverse(LinkedListNode<Integer> list) {
        int result = 0;
        int base = 0;

        while(list != null) {
            result += Math.pow(10, base) * list.getData();

            base++;
            list = list.getNext();
        }

        return result;
    }

    private static int listToNumberForward(LinkedListNode<Integer> list) {
        int result = 0;
        int base = 0;

        while(list.getNext() != null) {
            list = list.getNext();
        }

        while(list != null) {
            result += Math.pow(10, base) * list.getData();

            base++;
            list = list.getPrevious();
        }

        return result;
    }

}
