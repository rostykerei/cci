package nl.rostykerei.cci.ch02.q06;

public class PalindromeEndToEndTest extends PalindromeAbstractTest<PalindromeEndToEnd<String>> {

    @Override
    protected PalindromeEndToEnd<String> createChecker() {
        return new PalindromeEndToEnd<>();
    }
}