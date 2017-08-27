package nl.rostykerei.cci.ch02.q06;

public class PalindromeRotateTest extends PalindromeAbstractTest {

    @Override
    protected Palindrome<String> createTestInstance() {
        return new PalindromeRotate<>();
    }
}