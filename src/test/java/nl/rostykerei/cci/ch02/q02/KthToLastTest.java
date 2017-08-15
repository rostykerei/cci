package nl.rostykerei.cci.ch02.q02;

import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthToLastTest {
    @Test
    public void kthToLast() throws Exception {
        LinkedListNode<Integer> linkedList = new LinkedListNode<>(1).setNext(
                new LinkedListNode<>(2).setNext(
                        new LinkedListNode<>(3).setNext(
                                new LinkedListNode<>(4).setNext(
                                        new LinkedListNode<>(5)
                                )
                        )
                )
        );

        assertEquals(3, (int) KthToLast.kthToLast(linkedList, 2).getData());
        assertEquals(5, (int) KthToLast.kthToLast(linkedList, 0).getData());
        assertNull(KthToLast.kthToLast(linkedList, 5));
    }

}