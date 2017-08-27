package nl.rostykerei.cci.ch02.q07;

public class IntersectionImplTest extends IntersectionAbstractTest {

    @Override
    protected Intersection<String> createTestInstance() {
        return new IntersectionImpl<>();
    }
}