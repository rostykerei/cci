package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Implementation of {@link PalindromeListChecker} using a rotated copy of the list.
 * Takes O(N) extra memory but can be used for singly linked lists.
 *
 * @author Rosty Kerei
 */
public class PalindromeListCheckerRotate<T> implements PalindromeListChecker<T> {

    @Override
    public boolean isPalindrome(LinkedListNode<T> input) {

        LinkedListNode<T> rotated = rotateList(input);

        while (input != null) {
            if (!input.getData().equals(rotated.getData())) {
                return false;
            }

            input = input.getNext();
            rotated = rotated.getNext();
        }

        return true;
    }

    private LinkedListNode<T> rotateList(LinkedListNode<T> list) {
        LinkedListNode<T> rotated = null;
        LinkedListNode<T> prev = null;

        while (list != null) {
            rotated = new LinkedListNode<>(list.getData());

            if (prev != null) {
                rotated.setNext(prev);
            }

            prev = rotated;

            list = list.getNext();
        }

        return rotated;
    }
}
