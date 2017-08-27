package nl.rostykerei.cci.ch02.q01;

public class RemoveDupsHashSetTest extends RemoveDupsAbstractTest {

    @Override
    protected RemoveDups<Integer> createTestInstance() {
        return new RemoveDupsHashSet<>();
    }
}