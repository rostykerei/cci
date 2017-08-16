package nl.rostykerei.cci.ch02.q06;

public class PalindromeListCheckerRotateTest extends PalindromeListCheckerAbstractTest<PalindromeListCheckerRotate<String>> {

    @Override
    protected PalindromeListCheckerRotate<String> createChecker() {
        return new PalindromeListCheckerRotate<>();
    }
}