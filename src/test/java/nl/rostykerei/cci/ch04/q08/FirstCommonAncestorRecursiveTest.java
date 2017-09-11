package nl.rostykerei.cci.ch04.q08;

public class FirstCommonAncestorRecursiveTest extends FirstCommonAncestorAbstractTest {

    @Override
    protected FirstCommonAncestor<Integer> createTestInstance() {
        return new FirstCommonAncestorRecursive<>();
    }
}