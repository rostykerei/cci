package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link PalindromeListChecker} by iterating the list from both ends.
 * This takes O(2N) time and O(1) extra memory but the list must be doubly linked.
 *
 * @author Rosty Kerei
 */
public class PalindromeListCheckerEndToEnd<T> implements PalindromeListChecker<T> {

    @Override
    public boolean isPalindrome(LinkedListNode<T> head) {

        LinkedListNode<T> tail = getTail(head);

        boolean isMiddle = false;

        while (!isMiddle) {
            if (head == tail || head.getNext() == tail) {
                isMiddle = true;
            }

            if (!head.getData().equals(tail.getData())) {
                return false;
            }

            head = head.getNext();
            tail = tail.getPrevious();
        }

        return true;
    }

    private LinkedListNode<T> getTail(LinkedListNode<T> node) {
        while (node.getNext() != null) {
            node = node.getNext();
        }

        return node;
    }
}
