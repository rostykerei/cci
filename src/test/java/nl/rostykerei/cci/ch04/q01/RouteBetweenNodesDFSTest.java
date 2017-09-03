package nl.rostykerei.cci.ch04.q01;

public class RouteBetweenNodesDFSTest extends RouteBetweenNodesAbstractTest {

    @Override
    protected RouteBetweenNodes<String> createTestInstance() {
        return new RouteBetweenNodesDFS<>();
    }
}