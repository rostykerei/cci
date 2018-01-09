package nl.rostykerei.cci.ch08.q01;

public class TripleStepCacheImplTest extends TripleStepAbstractTest {

    @Override
    protected TripleStep createTestInstance() {
        return new TripleStepCacheImpl();
    }
}