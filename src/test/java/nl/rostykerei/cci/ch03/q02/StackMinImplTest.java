package nl.rostykerei.cci.ch03.q02;

public class StackMinImplTest extends StackMinAbstractTest {

    @Override
    protected StackMin<Integer> createTestInstance() {
        return new StackMinImpl();
    }
}