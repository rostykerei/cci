package nl.rostykerei.cci.ch03.q01;

public class ThreeInOneImplTest extends ThreeInOneAbstractTest {

    @Override
    protected ThreeInOne<Integer> createTestInstance() {
        return new ThreeInOneImpl<>(NUMBER_OF_STACKS, CAPACITY);
    }
}