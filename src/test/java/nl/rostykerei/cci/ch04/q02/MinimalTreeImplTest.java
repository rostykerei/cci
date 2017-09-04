package nl.rostykerei.cci.ch04.q02;

public class MinimalTreeImplTest extends MinimalTreeAbstractTest {

    @Override
    protected MinimalTree<Integer> createTestInstance() {
        return new MinimalTreeImpl<>();
    }
}