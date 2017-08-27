package nl.rostykerei.cci.ch01.q06;

public class StringCompressionImplTest extends StringCompressionAbstractTest {

    @Override
    protected StringCompression createTestInstance() {
        return new StringCompressionImpl();
    }
}