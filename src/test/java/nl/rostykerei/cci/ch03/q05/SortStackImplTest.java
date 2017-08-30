package nl.rostykerei.cci.ch03.q05;

public class SortStackImplTest extends SortStackAbstractTest {

    @Override
    protected SortStack<Integer> createTestInstance() {
        return new SortStackImpl<>();
    }
}