package nl.rostykerei.cci.ch02.q05;

public class SumListsImplTest extends SumListsAbstractTest {

    @Override
    protected SumLists createTestInstance() {
        return new SumListsImpl();
    }
}