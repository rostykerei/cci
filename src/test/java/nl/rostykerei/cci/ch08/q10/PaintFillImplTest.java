package nl.rostykerei.cci.ch08.q10;

public class PaintFillImplTest extends PaintFillAbstractTest {

    @Override
    protected PaintFill createTestInstance() {
        return new PaintFillImpl();
    }
}