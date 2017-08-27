package nl.rostykerei.cci.ch01.q08;

public class ZeroMatrixImplTest extends ZeroMatrixAbstractTest {

    @Override
    protected ZeroMatrix createTestInstance() {
        return new ZeroMatrixImpl();
    }
}