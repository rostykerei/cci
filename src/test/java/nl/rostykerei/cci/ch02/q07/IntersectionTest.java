package nl.rostykerei.cci.ch02.q07;

import nl.rostykerei.cci.datastructure.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntersectionTest {

    @Test
    public void isIntersectTrue() throws Exception {
        LinkedListNode<String> a = new LinkedListNode<>("a");
        LinkedListNode<String> b = new LinkedListNode<>("b");
        LinkedListNode<String> c = new LinkedListNode<>("c");
        LinkedListNode<String> d = new LinkedListNode<>("d");

        LinkedListNode<String> x = new LinkedListNode<>("x");
        LinkedListNode<String> y = new LinkedListNode<>("y");
        LinkedListNode<String> z = new LinkedListNode<>("z");

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);

        x.setNext(y);
        y.setNext(z);
        z.setNext(c);

        assertTrue(Intersection.isIntersect(a, x));
    }

    @Test
    public void isIntersectFalse() throws Exception {
        LinkedListNode<String> a = new LinkedListNode<>("a");
        LinkedListNode<String> b = new LinkedListNode<>("b");
        LinkedListNode<String> c = new LinkedListNode<>("c");

        LinkedListNode<String> x = new LinkedListNode<>("x");
        LinkedListNode<String> y = new LinkedListNode<>("y");
        LinkedListNode<String> z = new LinkedListNode<>("z");

        a.setNext(b);
        b.setNext(c);

        x.setNext(y);
        y.setNext(z);

        assertFalse(Intersection.isIntersect(a, x));
    }


}