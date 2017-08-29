package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.DoublyLinkedList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DoublyLinkedListImplTest {

    @Test
    public void setNextTest() throws Exception {
        DoublyLinkedList<Integer> nodeA = new DoublyLinkedListImpl<>(1);
        DoublyLinkedList<Integer> nodeB = new DoublyLinkedListImpl<>(2);

        nodeA.setNext(nodeB);

        assertTrue(nodeA.isFirst());
        assertTrue(nodeB.isLast());

        assertFalse(nodeA.isLast());
        assertFalse(nodeB.isFirst());

        assertEquals(nodeB, nodeA.getNext());
        assertEquals(nodeA, nodeB.getPrevious());

        nodeA.setNext(null);

        assertTrue(nodeA.isFirst());
        assertTrue(nodeA.isLast());

        assertTrue(nodeB.isFirst());
        assertTrue(nodeB.isLast());
    }

    @Test
    public void setNextTest2() throws Exception {
        DoublyLinkedList<Integer> nodeA = new DoublyLinkedListImpl<>(1);
        DoublyLinkedList<Integer> nodeB = new DoublyLinkedListImpl<>(2);

        nodeB.setPrevious(nodeA);
        nodeA.setNext(nodeB);

        assertEquals(nodeB, nodeA.getNext());
        assertEquals(nodeA, nodeB.getPrevious());

        nodeB.setPrevious(null);

        assertTrue(nodeA.isFirst());
        assertTrue(nodeA.isLast());

        assertTrue(nodeB.isFirst());
        assertTrue(nodeB.isLast());
    }

    @Test
    public void setPreviousTest() throws Exception {
        DoublyLinkedList<Integer> nodeA = new DoublyLinkedListImpl<>(1);
        DoublyLinkedList<Integer> nodeB = new DoublyLinkedListImpl<>(2);

        nodeB.setPrevious(nodeA);

        assertEquals(nodeB, nodeA.getNext());
        assertEquals(nodeA, nodeB.getPrevious());

        nodeB.setPrevious(null);

        assertNull(nodeB.getPrevious());
    }

    @Test
    public void setDataTest() throws Exception {
        DoublyLinkedList<Integer> nodeA = new DoublyLinkedListImpl<>(1);

        assertEquals(1, (int) nodeA.getData());

        nodeA.setData(2);

        assertEquals(2, (int) nodeA.getData());
    }

    @Test
    public void toList() throws Exception {
        DoublyLinkedList<Integer> nodeA = new DoublyLinkedListImpl<>(1);
        DoublyLinkedList<Integer> nodeB = new DoublyLinkedListImpl<>(2);
        DoublyLinkedList<Integer> nodeC = new DoublyLinkedListImpl<>(3);

        nodeA.setNext(nodeB);
        nodeC.setPrevious(nodeB);

        assertEquals(Arrays.asList(1, 2, 3), nodeA.toList());
        assertEquals(Arrays.asList(2, 3), nodeB.toList());
        assertEquals(1, nodeC.toList().size());
        assertEquals(3, (int) nodeC.toList().get(0));
    }
}