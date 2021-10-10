package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.DoublyLinkedList;
import nl.rostykerei.cci.datastructure.impl.DoublyLinkedListImpl;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public abstract class RemoveDupsAbstractTest extends AbstractFactoryTest<RemoveDups<Integer>> {

    @Test
    public void removeDups() {

        DoublyLinkedList<Integer> linkedList = new DoublyLinkedListImpl<>(1).setNext(
                new DoublyLinkedListImpl<>(2).setNext(
                        new DoublyLinkedListImpl<>(3).setNext(
                                new DoublyLinkedListImpl<>(2).setNext(
                                        new DoublyLinkedListImpl<>(5)
                                )
                        )
                )
        );

        testInstance.removeDups(linkedList);

        assertEquals(Arrays.asList(1, 2, 3, 5), linkedList.toList());
    }

    @Test
    public void removeDups2() {

        DoublyLinkedList<Integer> linkedList = new DoublyLinkedListImpl<>(1).setNext(
                new DoublyLinkedListImpl<>(2).setNext(
                        new DoublyLinkedListImpl<>(3).setNext(
                                new DoublyLinkedListImpl<>(4).setNext(
                                        new DoublyLinkedListImpl<>(2)
                                )
                        )
                )
        );

        testInstance.removeDups(linkedList);

        assertEquals(Arrays.asList(1, 2, 3, 4), linkedList.toList());
    }

}
