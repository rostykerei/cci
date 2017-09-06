package nl.rostykerei.cci.ch04.q10;

public class CheckSubtreeImplTest extends CheckSubtreeAbstractTest {

    @Override
    protected CheckSubtree<Integer> createTestInstance() {
        return new CheckSubtreeImpl<>();
    }
}