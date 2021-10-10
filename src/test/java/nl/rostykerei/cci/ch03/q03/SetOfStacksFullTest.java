package nl.rostykerei.cci.ch03.q03;

import nl.rostykerei.cci.datastructure.impl.StackImplTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetOfStacksFullTest extends StackImplTest {

    @Override
    protected SetOfStacks<Integer> createStack() {
        return new SetOfStacksFull<>(2);
    }

    @Test
    public void popAtTest() {
        SetOfStacks<Integer> setOfStacks = createStack();

        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);

        assertEquals(4, (int) setOfStacks.popAt(1));
        assertEquals(3, (int) setOfStacks.popAt(1));

        assertEquals(6, (int) setOfStacks.pop());
        assertEquals(5, (int) setOfStacks.pop());
        assertEquals(2, (int) setOfStacks.pop());
        assertEquals(1, (int) setOfStacks.pop());
    }

    @Test(expected = IllegalArgumentException.class)
    public void popAtWrongTest() {
        SetOfStacks<Integer> setOfStacks = createStack();
        setOfStacks.push(1);

        setOfStacks.popAt(5);
    }
}
