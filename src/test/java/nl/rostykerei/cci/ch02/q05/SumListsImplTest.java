package nl.rostykerei.cci.ch02.q05;

import static org.junit.Assert.*;

public class SumListsImplTest extends SumListsAbstractTest {

    @Override
    protected SumLists createTestInstance() {
        return new SumListsImpl();
    }
}