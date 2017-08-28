package nl.rostykerei.cci.datastructure;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class LinkedListNodeTest {

    @Test
    public void setNextTest() throws Exception {
        LinkedListNode<Integer> nodeA = new LinkedListNode<>(1);
        LinkedListNode<Integer> nodeB = new LinkedListNode<>(2);

        nodeA.setNext(nodeB);

        assertEquals(nodeB, nodeA.getNext());
        assertEquals(nodeA, nodeB.getPrevious());
    }

    @Test
    public void setPreviousTest() throws Exception {
        LinkedListNode<Integer> nodeA = new LinkedListNode<>(1);
        LinkedListNode<Integer> nodeB = new LinkedListNode<>(2);

        nodeB.setPrevious(nodeA);

        assertEquals(nodeB, nodeA.getNext());
        assertEquals(nodeA, nodeB.getPrevious());

        nodeB.setPrevious(null);

        assertNull(nodeB.getPrevious());
    }

    @Test
    public void setDataTest() throws Exception {
        LinkedListNode<Integer> nodeA = new LinkedListNode<>(1);

        assertEquals(1, (int) nodeA.getData());

        nodeA.setData(2);

        assertEquals(2, (int) nodeA.getData());
    }

    @Test
    public void toList() throws Exception {
        LinkedListNode<Integer> nodeA = new LinkedListNode<>(1);
        LinkedListNode<Integer> nodeB = new LinkedListNode<>(2);
        LinkedListNode<Integer> nodeC = new LinkedListNode<>(3);

        nodeA.setNext(nodeB);
        nodeC.setPrevious(nodeB);

        assertEquals(Arrays.asList(1, 2, 3), nodeA.toList());
        assertEquals(Arrays.asList(2, 3), nodeB.toList());
        assertEquals(1, nodeC.toList().size());
        assertEquals(3, (int) nodeC.toList().get(0));
    }

}