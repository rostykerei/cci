package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;

/**
 * Question 2.6 - Palindrome.
 *
 * @param <T> the class of the objects in the list
 * @author Rosty Kerei
 */
public interface Palindrome<T> {

    /**
     * Checks is the input list is a palindrome.
     *
     * @param input list to check
     * @return <code>true</code> is the input list is a palindrome
     */
    boolean isPalindrome(DoublyLinkedList<T> input);

}
