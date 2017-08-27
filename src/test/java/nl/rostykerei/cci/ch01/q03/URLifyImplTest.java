package nl.rostykerei.cci.ch01.q03;

public class URLifyImplTest extends URLifyAbstractTest {

    @Override
    protected URLify createTestInstance() {
        return new URLifyImpl();
    }
}