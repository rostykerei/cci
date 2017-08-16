package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.datastructure.LinkedListNode;

/**
 * Question 2.6 - Palindrome.
 *
 * @author Rosty Kerei
 */
public interface PalindromeListChecker<T> {

    /**
     * Checks is the input list is a palindrome.
     *
     * @param input list to check
     * @return <code>true</code> is the input list is a palindrome
     */
    boolean isPalindrome(LinkedListNode<T> input);

}
