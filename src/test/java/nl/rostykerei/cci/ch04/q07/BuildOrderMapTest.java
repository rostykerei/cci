package nl.rostykerei.cci.ch04.q07;

public class BuildOrderMapTest extends BuildOrderAbstractTest {

    @Override
    protected BuildOrder<String> createTestInstance() {
        return new BuildOrderMap<>();
    }
}