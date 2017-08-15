package nl.rostykerei.cci.ch02.q01;

import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public abstract class RemoveDupsAbstractTest<T extends RemoveDups<Integer>> {

    private T tester;

    protected abstract T createTester();

    @Before
    public void setUp() {
        tester = createTester();
    }

    @Test
    public void removeDups() throws Exception {

        LinkedListNode<Integer> linkedList = new LinkedListNode<>(1).setNext(
                new LinkedListNode<>(2).setNext(
                        new LinkedListNode<>(3).setNext(
                                new LinkedListNode<>(2).setNext(
                                        new LinkedListNode<>(5)
                                )
                        )
                )
        );

        tester.removeDups(linkedList);

        assertEquals(Arrays.asList(1,2,3,5), linkedList.toList());
    }

    @Test
    public void removeDups2() throws Exception {

        LinkedListNode<Integer> linkedList = new LinkedListNode<>(1).setNext(
                new LinkedListNode<>(2).setNext(
                        new LinkedListNode<>(3).setNext(
                                new LinkedListNode<>(4).setNext(
                                        new LinkedListNode<>(2)
                                )
                        )
                )
        );

        tester.removeDups(linkedList);

        assertEquals(Arrays.asList(1,2,3,4), linkedList.toList());
    }

}