package nl.rostykerei.cci.ch04.q03;

public class ListOfDepthsDFSTest extends ListOfDepthsImplAbstractTest {

    @Override
    protected ListOfDepths<Integer> createTestInstance() {
        return new ListOfDepthsDFS<>();
    }
}