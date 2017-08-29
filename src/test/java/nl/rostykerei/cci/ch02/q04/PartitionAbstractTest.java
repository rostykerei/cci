package nl.rostykerei.cci.ch02.q04;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.SinglyLinkedList;
import nl.rostykerei.cci.datastructure.impl.SinglyLinkedListImpl;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public abstract class PartitionAbstractTest extends AbstractFactoryTest<Partition<Integer>> {
    private SinglyLinkedList<Integer> getLinkedList() {
        return new SinglyLinkedListImpl<>(3).setNext(
                new SinglyLinkedListImpl<>(5).setNext(
                        new SinglyLinkedListImpl<>(8).setNext(
                                new SinglyLinkedListImpl<>(5).setNext(
                                        new SinglyLinkedListImpl<>(10).setNext(
                                                new SinglyLinkedListImpl<>(2).setNext(
                                                        new SinglyLinkedListImpl<>(1)
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void partition() throws Exception {
        assertEquals(Arrays.asList(3, 2, 1, 5, 8, 5, 10), testInstance.partition(getLinkedList(), 5).toList());
    }

    @Test
    public void partition2() throws Exception {
        assertEquals(Arrays.asList(3, 5, 8, 5, 10, 2, 1), testInstance.partition(getLinkedList(), 15).toList());

    }

    @Test
    public void partition3() throws Exception {
        assertEquals(Arrays.asList(3, 5, 8, 5, 10, 2, 1), testInstance.partition(getLinkedList(), 0).toList());

    }

}