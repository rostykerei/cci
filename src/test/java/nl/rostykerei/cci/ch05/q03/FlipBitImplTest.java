package nl.rostykerei.cci.ch05.q03;

public class FlipBitImplTest extends FlipBitAbstractTest {

    @Override
    protected FlipBit createTestInstance() {
        return new FlipBitImpl();
    }
}