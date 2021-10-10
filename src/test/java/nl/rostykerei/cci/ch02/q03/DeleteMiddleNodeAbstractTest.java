package nl.rostykerei.cci.ch02.q03;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.SinglyLinkedList;
import nl.rostykerei.cci.datastructure.impl.SinglyLinkedListImpl;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public abstract class DeleteMiddleNodeAbstractTest extends AbstractFactoryTest<DeleteMiddleNode<Integer>> {

    @Test
    public void deleteMiddleNode() {
        SinglyLinkedList<Integer> n5 = new SinglyLinkedListImpl<>(5);

        SinglyLinkedList<Integer> n4 = new SinglyLinkedListImpl<>(4);
        n4.setNext(n5);

        SinglyLinkedList<Integer> n3 = new SinglyLinkedListImpl<>(3);
        n3.setNext(n4);

        SinglyLinkedList<Integer> n2 = new SinglyLinkedListImpl<>(2);
        n2.setNext(n3);

        SinglyLinkedList<Integer> n1 = new SinglyLinkedListImpl<>(1);

        n1.setNext(n2);

        testInstance.deleteMiddleNode(n3);

        assertEquals(Arrays.asList(1, 2, 4, 5), n1.toList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLastNode() {
        SinglyLinkedList<Integer> n2 = new SinglyLinkedListImpl<>(2);
        SinglyLinkedList<Integer> n1 = new SinglyLinkedListImpl<>(1);
        n1.setNext(n2);

        testInstance.deleteMiddleNode(n2);
    }
}
