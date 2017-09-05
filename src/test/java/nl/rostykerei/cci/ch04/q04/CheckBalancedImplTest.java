package nl.rostykerei.cci.ch04.q04;

public class CheckBalancedImplTest extends CheckBalancedAbstractTest {

    @Override
    protected CheckBalanced<Integer> createTestInstance() {
        return new CheckBalancedImpl<>();
    }
}