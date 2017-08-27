package nl.rostykerei.cci.ch02.q03;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public abstract class DeleteMiddleNodeAbstractTest extends AbstractFactoryTest<DeleteMiddleNode<Integer>> {

    @Test
    public void deleteMiddleNode() throws Exception {
        LinkedListNode<Integer> n5 = new LinkedListNode<>(5);

        LinkedListNode<Integer> n4 = new LinkedListNode<>(4);
        n4.setNext(n5);

        LinkedListNode<Integer> n3 = new LinkedListNode<>(3);
        n3.setNext(n4);

        LinkedListNode<Integer> n2 = new LinkedListNode<>(2);
        n2.setNext(n3);

        LinkedListNode<Integer> n1 = new LinkedListNode<>(1);

        n1.setNext(n2);

        testInstance.deleteMiddleNode(n3);

        assertEquals(Arrays.asList(1, 2, 4, 5), n1.toList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLastNode() throws Exception {
        LinkedListNode<Integer> n2 = new LinkedListNode<>(2);
        LinkedListNode<Integer> n1 = new LinkedListNode<>(1);
        n1.setNext(n2);

        testInstance.deleteMiddleNode(n2);
    }
}