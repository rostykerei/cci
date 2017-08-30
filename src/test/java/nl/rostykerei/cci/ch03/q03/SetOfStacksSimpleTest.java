package nl.rostykerei.cci.ch03.q03;

import nl.rostykerei.cci.datastructure.Stack;
import nl.rostykerei.cci.datastructure.impl.StackImplTest;
import org.junit.Test;

public class SetOfStacksSimpleTest extends StackImplTest {

    @Override
    protected Stack<Integer> createStack() {
        return new SetOfStacksSimple<>(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongCapacityTest() throws Exception {
        new SetOfStacksSimple<Integer>(-1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void popAtTest() throws Exception {
        new SetOfStacksSimple<>(1).popAt(1);
    }
}