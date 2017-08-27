package nl.rostykerei.cci.ch02.q05;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class SumListsAbstractTest extends AbstractFactoryTest<SumLists> {

    @Test
    public void sumListsReverse() throws Exception {

        LinkedListNode<Byte> l617 = new LinkedListNode<>((byte) 7).setNext(
                new LinkedListNode<>((byte) 1).setNext(
                        new LinkedListNode<>((byte) 6)
                )
        );

        LinkedListNode<Byte> l295 = new LinkedListNode<Byte>((byte) 5).setNext(
                new LinkedListNode<>((byte) 9).setNext(
                        new LinkedListNode<>((byte) 2)
                )
        );

        assertEquals(912, testInstance.sumListsReverse(l617, l295));
    }

    @Test
    public void sumListsForward() throws Exception {

        LinkedListNode<Byte> l617 = new LinkedListNode<>((byte) 6).setNext(
                new LinkedListNode<>((byte) 1).setNext(
                        new LinkedListNode<>((byte) 7)
                )
        );

        LinkedListNode<Byte> l295 = new LinkedListNode<>((byte) 2).setNext(
                new LinkedListNode<>((byte) 9).setNext(
                        new LinkedListNode<>((byte) 5)
                )
        );

        assertEquals(912, testInstance.sumListsForward(l617, l295));
    }

}