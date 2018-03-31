package nl.rostykerei.cci.ch05.q01;

public class InsertionImplTest extends InsertionAbstractTest {

    @Override
    protected Insertion createTestInstance() {
        return new InsertionImpl();
    }
}