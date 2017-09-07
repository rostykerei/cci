package nl.rostykerei.cci.ch04.q06;

public class SuccessorImplTest extends SuccessorAbstractTest {

    @Override
    protected Successor<Integer> createTestInstance() {
        return new SuccessorImpl<>();
    }
}