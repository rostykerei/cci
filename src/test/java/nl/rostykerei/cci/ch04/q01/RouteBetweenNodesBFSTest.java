package nl.rostykerei.cci.ch04.q01;

public class RouteBetweenNodesBFSTest extends RouteBetweenNodesAbstractTest {

    @Override
    protected RouteBetweenNodes<String> createTestInstance() {
        return new RouteBetweenNodesBFS<>();
    }
}