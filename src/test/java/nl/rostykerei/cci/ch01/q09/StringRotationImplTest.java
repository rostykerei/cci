package nl.rostykerei.cci.ch01.q09;

public class StringRotationImplTest extends StringRotationAbstractTest {

    @Override
    protected StringRotation createTestInstance() {
        return new StringRotationImpl();
    }
}