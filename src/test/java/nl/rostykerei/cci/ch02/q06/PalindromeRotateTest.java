package nl.rostykerei.cci.ch02.q06;

public class PalindromeRotateTest extends PalindromeAbstractTest<PalindromeRotate<String>> {

    @Override
    protected PalindromeRotate<String> createChecker() {
        return new PalindromeRotate<>();
    }
}