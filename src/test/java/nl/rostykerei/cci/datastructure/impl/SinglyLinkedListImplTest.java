package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.SinglyLinkedList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SinglyLinkedListImplTest {

    @Test
    public void setNextTest() {
        SinglyLinkedList<Integer> nodeA = new SinglyLinkedListImpl<>(1);
        SinglyLinkedList<Integer> nodeB = new SinglyLinkedListImpl<>(2);

        nodeA.setNext(nodeB);

        assertEquals(nodeB, nodeA.getNext());
        assertNull(nodeB.getNext());

        assertFalse(nodeA.isLast());
        assertTrue(nodeB.isLast());
    }

    @Test
    public void setDataTest() {
        SinglyLinkedList<Integer> nodeA = new SinglyLinkedListImpl<>(1);

        assertEquals(1, (int) nodeA.getData());

        nodeA.setData(2);

        assertEquals(2, (int) nodeA.getData());
    }

    @Test
    public void toList() {
        SinglyLinkedList<Integer> nodeA = new SinglyLinkedListImpl<>(1);
        SinglyLinkedList<Integer> nodeB = new SinglyLinkedListImpl<>(2);
        SinglyLinkedList<Integer> nodeC = new SinglyLinkedListImpl<>(3);

        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);

        assertEquals(Arrays.asList(1, 2, 3), nodeA.toList());
        assertEquals(Arrays.asList(2, 3), nodeB.toList());
        assertEquals(1, nodeC.toList().size());
        assertEquals(3, (int) nodeC.toList().get(0));
    }

}
