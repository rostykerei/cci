package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;

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
    public boolean isPalindrome(final DoublyLinkedList<T> input) {

        DoublyLinkedList<T> head = input;
        DoublyLinkedList<T> tail = getTail(head);

        boolean isMiddle = false;

        while (!isMiddle) {
            if (head.equals(tail) || head.getNext().equals(tail)) {
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
    private DoublyLinkedList<T> getTail(final DoublyLinkedList<T> head) {
        DoublyLinkedList<T> node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }

        return node;
    }
}
