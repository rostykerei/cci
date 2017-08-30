package nl.rostykerei.cci.ch03.q05;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.Stack;
import nl.rostykerei.cci.datastructure.impl.StackImpl;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public abstract class SortStackAbstractTest extends AbstractFactoryTest<SortStack<Integer>> {

    @Test
    public void testSort() throws Exception {

        Stack<Integer> stack = new StackImpl<>();

        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(3);

        testInstance.sort(stack);

        assertEquals(1, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
        assertEquals(3, (int) stack.pop());
        assertEquals(4, (int) stack.pop());
        assertEquals(5, (int) stack.pop());
    }

    @Test
    public void testSort2() throws Exception {

        Stack<Integer> stack = new StackImpl<>();

        stack.push(3);
        stack.push(2);
        stack.push(2);
        stack.push(1);

        testInstance.sort(stack);

        assertEquals(1, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
        assertEquals(3, (int) stack.pop());
    }
}
