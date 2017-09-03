package nl.rostykerei.cci.ch04.q01;

public class RouteBetweenNodesBSFTest extends RouteBetweenNodesAbstractTest {

    @Override
    protected RouteBetweenNodes<String> createTestInstance() {
        return new RouteBetweenNodesBSF<>();
    }
}