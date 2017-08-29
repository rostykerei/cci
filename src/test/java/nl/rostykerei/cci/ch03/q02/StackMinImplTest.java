package nl.rostykerei.cci.ch03.q02;

public class StackMinImplTest extends StackMinAbstractTest {

    @Override
    protected StackMin createTestInstance() {
        return new StackMinImpl();
    }
}