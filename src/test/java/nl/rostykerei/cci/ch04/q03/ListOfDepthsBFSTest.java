package nl.rostykerei.cci.ch04.q03;

public class ListOfDepthsBFSTest extends ListOfDepthsImplAbstractTest {

    @Override
    protected ListOfDepths<Integer> createTestInstance() {
        return new ListOfDepthsBFS<>();
    }
}