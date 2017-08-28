package nl.rostykerei.cci.ch01.q07;

import static org.junit.Assert.*;

public class RotateMatrixTransposeTest extends RotateMatrixAbstractTest {

    @Override
    protected RotateMatrix createTestInstance() {
        return new RotateMatrixTranspose();
    }
}