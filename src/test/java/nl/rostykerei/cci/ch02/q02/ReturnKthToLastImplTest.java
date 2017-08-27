package nl.rostykerei.cci.ch02.q02;

public class ReturnKthToLastImplTest extends ReturnKthToLastAbstractTest {

    @Override
    protected ReturnKthToLast<Integer> createTestInstance() {
        return new ReturnKthToLastImpl<>();
    }
}