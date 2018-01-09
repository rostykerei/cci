package nl.rostykerei.cci.ch08.q01;

public class TripleStepImplTest extends TripleStepAbstractTest {

    @Override
    protected TripleStep createTestInstance() {
        return new TripleStepImpl();
    }
}