package nl.rostykerei.cci.ch02.q01;

public class RemoveDupsRunnerTest extends RemoveDupsAbstractTest<RemoveDupsRunner<Integer>> {

    @Override
    protected RemoveDupsRunner<Integer> createTester() {
        return new RemoveDupsRunner<>();
    }
}