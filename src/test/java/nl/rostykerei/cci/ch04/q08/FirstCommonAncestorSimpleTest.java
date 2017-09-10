package nl.rostykerei.cci.ch04.q08;

public class FirstCommonAncestorSimpleTest extends FirstCommonAncestorAbstractTest {

    @Override
    protected FirstCommonAncestor<Integer> createTestInstance() {
        return new FirstCommonAncestorSimple<>();
    }
}