package nl.rostykerei.cci.ch02.q06;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class PalindromeAbstractTest extends AbstractFactoryTest<Palindrome<String>> {

    @Test
    public void testTrue() throws Exception {
        LinkedListNode<String> linkedList1 = new LinkedListNode<>("A").setNext(
                new LinkedListNode<>("B").setNext(
                        new LinkedListNode<>("C").setNext(
                                new LinkedListNode<>("B").setNext(
                                        new LinkedListNode<>("A")
                                )
                        )
                )
        );

        assertTrue(testInstance.isPalindrome(linkedList1));

        LinkedListNode<String> linkedList2 = new LinkedListNode<>("A").setNext(
                new LinkedListNode<>("B").setNext(
                        new LinkedListNode<>("B").setNext(
                                new LinkedListNode<>("A")
                        )
                )
        );

        assertTrue(testInstance.isPalindrome(linkedList2));

        LinkedListNode<String> linkedList3 = new LinkedListNode<>("A").setNext(
                new LinkedListNode<>("A")
        );

        assertTrue(testInstance.isPalindrome(linkedList3));

        assertTrue(testInstance.isPalindrome(new LinkedListNode<>("A")));
    }

    @Test
    public void testFalse() throws Exception {
        LinkedListNode<String> linkedList1 = new LinkedListNode<>("A").setNext(
                new LinkedListNode<>("B").setNext(
                        new LinkedListNode<>("C").setNext(
                                new LinkedListNode<>("X").setNext(
                                        new LinkedListNode<>("A")
                                )
                        )
                )
        );

        assertFalse(testInstance.isPalindrome(linkedList1));

        LinkedListNode<String> linkedList2 = new LinkedListNode<>("A").setNext(
                new LinkedListNode<>("B")
        );

        assertFalse(testInstance.isPalindrome(linkedList2));
    }
}