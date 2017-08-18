package nl.rostykerei.cci.ch02.q08;

public class LoopDetectionBackrunnerTest extends LoopDetectionAbstractTest<LoopDetectionBackrunner<String>> {

    @Override
    protected LoopDetectionBackrunner<String> createTester() {
        return new LoopDetectionBackrunner<>();
    }
}