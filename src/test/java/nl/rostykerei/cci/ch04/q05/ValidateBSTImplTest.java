package nl.rostykerei.cci.ch04.q05;

public class ValidateBSTImplTest extends ValidateBSTAbstractTest {

    @Override
    protected ValidateBST<Integer> createTestInstance() {
        return new ValidateBSTImpl<>();
    }
}