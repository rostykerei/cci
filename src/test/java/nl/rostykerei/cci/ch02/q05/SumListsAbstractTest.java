package nl.rostykerei.cci.ch02.q05;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.DoublyLinkedList;
import nl.rostykerei.cci.datastructure.impl.DoublyLinkedListImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class SumListsAbstractTest extends AbstractFactoryTest<SumLists> {

    @Test
    public void sumListsReverse() throws Exception {

        DoublyLinkedList<Byte> l617 = new DoublyLinkedListImpl<>((byte) 7).setNext(
                new DoublyLinkedListImpl<>((byte) 1).setNext(
                        new DoublyLinkedListImpl<>((byte) 6)
                )
        );

        DoublyLinkedList<Byte> l295 = new DoublyLinkedListImpl<Byte>((byte) 5).setNext(
                new DoublyLinkedListImpl<>((byte) 9).setNext(
                        new DoublyLinkedListImpl<>((byte) 2)
                )
        );

        assertEquals(912, testInstance.sumListsReverse(l617, l295));
    }

    @Test
    public void sumListsForward() throws Exception {

        DoublyLinkedList<Byte> l617 = new DoublyLinkedListImpl<>((byte) 6).setNext(
                new DoublyLinkedListImpl<>((byte) 1).setNext(
                        new DoublyLinkedListImpl<>((byte) 7)
                )
        );

        DoublyLinkedList<Byte> l295 = new DoublyLinkedListImpl<>((byte) 2).setNext(
                new DoublyLinkedListImpl<>((byte) 9).setNext(
                        new DoublyLinkedListImpl<>((byte) 5)
                )
        );

        assertEquals(912, testInstance.sumListsForward(l617, l295));
    }

}