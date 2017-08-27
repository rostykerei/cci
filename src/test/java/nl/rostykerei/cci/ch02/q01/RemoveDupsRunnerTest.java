package nl.rostykerei.cci.ch02.q01;

public class RemoveDupsRunnerTest extends RemoveDupsAbstractTest {

    @Override
    protected RemoveDups<Integer> createTestInstance() {
        return new RemoveDupsRunner<>();
    }
}