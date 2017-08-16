package nl.rostykerei.cci.ch02.q06;

public class PalindromeListCheckerEndToEndTest extends PalindromeListCheckerAbstractTest<PalindromeListCheckerEndToEnd<String>> {

    @Override
    protected PalindromeListCheckerEndToEnd<String> createChecker() {
        return new PalindromeListCheckerEndToEnd<>();
    }
}