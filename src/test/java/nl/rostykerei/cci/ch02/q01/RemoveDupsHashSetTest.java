package nl.rostykerei.cci.ch02.q01;

public class RemoveDupsHashSetTest extends RemoveDupsAbstractTest<RemoveDupsHashSet<Integer>> {

    @Override
    protected RemoveDupsHashSet<Integer> createTester() {
        return new RemoveDupsHashSet<>();
    }
}