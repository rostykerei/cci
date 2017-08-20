package nl.rostykerei.cci.ch02.q05;

import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumListsTest {
    @Test
    public void sumListsReverse() throws Exception {

        LinkedListNode<Integer> l617 = new LinkedListNode<>(7).setNext(
                new LinkedListNode<>(1).setNext(
                        new LinkedListNode<>(6)
                )
        );

        LinkedListNode<Integer> l295 = new LinkedListNode<>(5).setNext(
                new LinkedListNode<>(9).setNext(
                        new LinkedListNode<>(2)
                )
        );

        assertEquals(912, SumLists.sumListsReverse(l617, l295));
    }

    @Test
    public void sumListsForward() throws Exception {

        LinkedListNode<Integer> l617 = new LinkedListNode<>(6).setNext(
                new LinkedListNode<>(1).setNext(
                        new LinkedListNode<>(7)
                )
        );

        LinkedListNode<Integer> l295 = new LinkedListNode<>(2).setNext(
                new LinkedListNode<>(9).setNext(
                        new LinkedListNode<>(5)
                )
        );

        assertEquals(912, SumLists.sumListsForward(l617, l295));
    }

}