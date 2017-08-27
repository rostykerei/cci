package nl.rostykerei.cci.ch02.q03;

import static org.junit.Assert.*;

public class DeleteMiddleNodeImplTest extends DeleteMiddleNodeAbstractTest {

    @Override
    protected DeleteMiddleNode<Integer> createTestInstance() {
        return new DeleteMiddleNodeImpl<>();
    }
}