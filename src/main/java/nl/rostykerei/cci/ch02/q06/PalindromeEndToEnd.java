package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link Palindrome} by iterating the list from both ends.
 * This takes O(2N) time and O(1) extra memory but the list
 * must be doubly linked.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class PalindromeEndToEnd<T> implements Palindrome<T> {

    @Override
    public boolean isPalindrome(final LinkedListNode<T> input) {

        LinkedListNode<T> head = input;
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

    /**
     * Gets the tail of the list.
     *
     * @param head head node
     * @return tail node
     */
    private LinkedListNode<T> getTail(final LinkedListNode<T> head) {
        LinkedListNode<T> node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }

        return node;
    }
}
