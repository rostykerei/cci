package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;
import nl.rostykerei.cci.datastructure.impl.DoublyLinkedListImpl;

/**
 * Implementation of {@link Palindrome} using a rotated copy of the list.
 * Takes O(N) extra memory but can be used for singly linked lists.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public final class PalindromeRotate<T> implements Palindrome<T> {

    @Override
    public boolean isPalindrome(final DoublyLinkedList<T> input) {

        DoublyLinkedList<T> head = input;
        DoublyLinkedList<T> rotated = rotateList(head);

        while (head != null) {
            if (!head.getData().equals(rotated.getData())) {
                return false;
            }

            head = head.getNext();
            rotated = rotated.getNext();
        }

        return true;
    }

    /**
     * Rotates list.
     *
     * @param input head node
     * @return rotated list
     */
    private DoublyLinkedList<T> rotateList(final DoublyLinkedList<T> input) {
        DoublyLinkedList<T> head = input;

        DoublyLinkedList<T> rotated = null;
        DoublyLinkedList<T> prev = null;

        while (head != null) {
            rotated = new DoublyLinkedListImpl<>(head.getData());

            if (prev != null) {
                rotated.setNext(prev);
            }

            prev = rotated;

            head = head.getNext();
        }

        return rotated;
    }
}
