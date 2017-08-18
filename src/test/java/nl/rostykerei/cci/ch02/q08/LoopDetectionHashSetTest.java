package nl.rostykerei.cci.ch02.q08;

public class LoopDetectionHashSetTest extends LoopDetectionAbstractTest<LoopDetectionHashSet<String>> {

    @Override
    protected LoopDetectionHashSet<String> createTester() {
        return new LoopDetectionHashSet<>();
    }
}