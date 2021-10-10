package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.DoublyLinkedList;
import nl.rostykerei.cci.datastructure.impl.DoublyLinkedListImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public abstract class LoopDetectionAbstractTest extends AbstractFactoryTest<LoopDetection<String>> {

    @Test
    public void detectLoop() {
        DoublyLinkedList<String> a = new DoublyLinkedListImpl<>("a");
        DoublyLinkedList<String> b = new DoublyLinkedListImpl<>("b");
        DoublyLinkedList<String> c = new DoublyLinkedListImpl<>("c");
        DoublyLinkedList<String> d = new DoublyLinkedListImpl<>("d");

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(c);

        assertEquals(c, testInstance.detectLoop(a));
    }

    @Test
    public void detectLoopNull() {
        DoublyLinkedList<String> a = new DoublyLinkedListImpl<>("a");
        DoublyLinkedList<String> b = new DoublyLinkedListImpl<>("b");
        DoublyLinkedList<String> c = new DoublyLinkedListImpl<>("c");

        a.setNext(b);
        b.setNext(c);

        assertNull(testInstance.detectLoop(a));
    }

}
