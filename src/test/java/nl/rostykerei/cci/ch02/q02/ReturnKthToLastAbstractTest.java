package nl.rostykerei.cci.ch02.q02;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.SinglyLinkedList;
import nl.rostykerei.cci.datastructure.impl.SinglyLinkedListImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public abstract class ReturnKthToLastAbstractTest extends AbstractFactoryTest<ReturnKthToLast<Integer>> {

    @Test
    public void kthToLast() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedListImpl<>(1).setNext(
                new SinglyLinkedListImpl<>(2).setNext(
                        new SinglyLinkedListImpl<>(3).setNext(
                                new SinglyLinkedListImpl<>(4).setNext(
                                        new SinglyLinkedListImpl<>(5)
                                )
                        )
                )
        );

        assertEquals(3, (int) testInstance.kthToLast(linkedList, 2).getData());
        assertEquals(5, (int) testInstance.kthToLast(linkedList, 0).getData());
        assertNull(testInstance.kthToLast(linkedList, 5));
    }

}
