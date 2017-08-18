package nl.rostykerei.cci.ch02.q08;

import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public abstract class LoopDetectionAbstractTest<T extends LoopDetection<String>> {

    private T tester;

    protected abstract T createTester();

    @Before
    public void setUp() {
        tester = createTester();
    }

    @Test
    public void detectLoop() throws Exception {
        LinkedListNode<String> a = new LinkedListNode<>("a");
        LinkedListNode<String> b = new LinkedListNode<>("b");
        LinkedListNode<String> c = new LinkedListNode<>("c");
        LinkedListNode<String> d = new LinkedListNode<>("d");

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(c);

        assertEquals(c, tester.detectLoop(a));
    }

    @Test
    public void detectLoopNull() throws Exception {
        LinkedListNode<String> a = new LinkedListNode<>("a");
        LinkedListNode<String> b = new LinkedListNode<>("b");
        LinkedListNode<String> c = new LinkedListNode<>("c");

        a.setNext(b);
        b.setNext(c);

        assertNull(tester.detectLoop(a));
    }

}