package nl.rostykerei.cci.ch02.q03;

public class DeleteMiddleNodeImplTest extends DeleteMiddleNodeAbstractTest {

    @Override
    protected DeleteMiddleNode<Integer> createTestInstance() {
        return new DeleteMiddleNodeImpl<>();
    }
}