package nl.rostykerei.cci.ch02.q04;

import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PartitionTest {
    private LinkedListNode<Integer> getLinkedList() {
        return new LinkedListNode<>(3).setNext(
                new LinkedListNode<>(5).setNext(
                        new LinkedListNode<>(8).setNext(
                                new LinkedListNode<>(5).setNext(
                                        new LinkedListNode<>(10).setNext(
                                                new LinkedListNode<>(2).setNext(
                                                        new LinkedListNode<>(1)
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void partition() throws Exception {
        assertEquals(Arrays.asList(3, 2, 1, 5, 8, 5, 10), Partition.partition(getLinkedList(), 5).toList());
    }

    @Test
    public void partition2() throws Exception {
        assertEquals(Arrays.asList(3, 5, 8, 5, 10, 2, 1), Partition.partition(getLinkedList(), 15).toList());

    }

    @Test
    public void partition3() throws Exception {
        assertEquals(Arrays.asList(3, 5, 8, 5, 10, 2, 1), Partition.partition(getLinkedList(), 0).toList());

    }

}