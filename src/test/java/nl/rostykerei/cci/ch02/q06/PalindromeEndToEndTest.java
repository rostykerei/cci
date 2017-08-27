package nl.rostykerei.cci.ch02.q06;

public class PalindromeEndToEndTest extends PalindromeAbstractTest {

    @Override
    protected Palindrome<String> createTestInstance() {
        return new PalindromeEndToEnd<>();
    }
}