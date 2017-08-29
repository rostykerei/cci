package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.DoublyLinkedList;
import nl.rostykerei.cci.datastructure.impl.DoublyLinkedListImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class PalindromeAbstractTest extends AbstractFactoryTest<Palindrome<String>> {

    @Test
    public void testTrue() throws Exception {
        DoublyLinkedList<String> linkedList1 = new DoublyLinkedListImpl<>("A").setNext(
                new DoublyLinkedListImpl<>("B").setNext(
                        new DoublyLinkedListImpl<>("C").setNext(
                                new DoublyLinkedListImpl<>("B").setNext(
                                        new DoublyLinkedListImpl<>("A")
                                )
                        )
                )
        );

        assertTrue(testInstance.isPalindrome(linkedList1));

        DoublyLinkedList<String> linkedList2 = new DoublyLinkedListImpl<>("A").setNext(
                new DoublyLinkedListImpl<>("B").setNext(
                        new DoublyLinkedListImpl<>("B").setNext(
                                new DoublyLinkedListImpl<>("A")
                        )
                )
        );

        assertTrue(testInstance.isPalindrome(linkedList2));

        DoublyLinkedList<String> linkedList3 = new DoublyLinkedListImpl<>("A").setNext(
                new DoublyLinkedListImpl<>("A")
        );

        assertTrue(testInstance.isPalindrome(linkedList3));

        assertTrue(testInstance.isPalindrome(new DoublyLinkedListImpl<>("A")));
    }

    @Test
    public void testFalse() throws Exception {
        DoublyLinkedList<String> linkedList1 = new DoublyLinkedListImpl<>("A").setNext(
                new DoublyLinkedListImpl<>("B").setNext(
                        new DoublyLinkedListImpl<>("C").setNext(
                                new DoublyLinkedListImpl<>("X").setNext(
                                        new DoublyLinkedListImpl<>("A")
                                )
                        )
                )
        );

        assertFalse(testInstance.isPalindrome(linkedList1));

        DoublyLinkedList<String> linkedList2 = new DoublyLinkedListImpl<>("A").setNext(
                new DoublyLinkedListImpl<>("B")
        );

        assertFalse(testInstance.isPalindrome(linkedList2));
    }
}