package nl.rostykerei.cci.ch05.q06;

public class ConversionImplTest extends ConversionAbstractTest {

    @Override
    protected Conversion createTestInstance() {
        return new ConversionImpl();
    }
}