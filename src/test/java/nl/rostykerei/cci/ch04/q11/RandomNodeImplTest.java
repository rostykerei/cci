package nl.rostykerei.cci.ch04.q11;

public class RandomNodeImplTest extends RandomNodeAbstractTest {


    @Override
    protected RandomNode<Integer> createNode(Integer value) {
        return new RandomNodeImpl<>(value);
    }
}