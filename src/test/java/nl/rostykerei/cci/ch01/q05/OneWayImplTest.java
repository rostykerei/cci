package nl.rostykerei.cci.ch01.q05;

public class OneWayImplTest extends OneWayAbstractTest {

    @Override
    protected OneWay createTestInstance() {
        return new OneWayImpl();
    }
}