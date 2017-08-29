package nl.rostykerei.cci.ch02.q07;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.SinglyLinkedList;
import nl.rostykerei.cci.datastructure.impl.SinglyLinkedListImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class IntersectionAbstractTest extends AbstractFactoryTest<Intersection<String>> {

    @Test
    public void isIntersectTrue() throws Exception {
        SinglyLinkedList<String> a = new SinglyLinkedListImpl<>("a");
        SinglyLinkedList<String> b = new SinglyLinkedListImpl<>("b");
        SinglyLinkedList<String> c = new SinglyLinkedListImpl<>("c");
        SinglyLinkedList<String> d = new SinglyLinkedListImpl<>("d");

        SinglyLinkedList<String> x = new SinglyLinkedListImpl<>("x");
        SinglyLinkedList<String> y = new SinglyLinkedListImpl<>("y");
        SinglyLinkedList<String> z = new SinglyLinkedListImpl<>("z");

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);

        x.setNext(y);
        y.setNext(z);
        z.setNext(c);

        assertTrue(testInstance.isIntersect(a, x));
    }

    @Test
    public void isIntersectFalse() throws Exception {
        SinglyLinkedList<String> a = new SinglyLinkedListImpl<>("a");
        SinglyLinkedList<String> b = new SinglyLinkedListImpl<>("b");
        SinglyLinkedList<String> c = new SinglyLinkedListImpl<>("c");

        SinglyLinkedList<String> x = new SinglyLinkedListImpl<>("x");
        SinglyLinkedList<String> y = new SinglyLinkedListImpl<>("y");
        SinglyLinkedList<String> z = new SinglyLinkedListImpl<>("z");

        a.setNext(b);
        b.setNext(c);

        x.setNext(y);
        y.setNext(z);

        assertFalse(testInstance.isIntersect(a, x));
    }


}