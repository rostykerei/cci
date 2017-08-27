package nl.rostykerei.cci.ch02.q08;

public class LoopDetectionBackrunnerTest extends LoopDetectionAbstractTest {

    @Override
    protected LoopDetection<String> createTestInstance() {
        return new LoopDetectionBackrunner<>();
    }
}