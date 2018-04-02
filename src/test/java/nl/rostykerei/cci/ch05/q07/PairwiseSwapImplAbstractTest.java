package nl.rostykerei.cci.ch05.q07;

public class PairwiseSwapImplAbstractTest extends PairwiseSwapAbstractTest {

    @Override
    protected PairwiseSwap createTestInstance() {
        return new PairwiseSwapImpl();
    }
}