package nl.rostykerei.cci.ch03.q02;

public class StackMinWrapperImplTest extends StackMinAbstractTest {

    @Override
    protected StackMin createTestInstance() {
        return new StackMinWrapperImpl();
    }

}