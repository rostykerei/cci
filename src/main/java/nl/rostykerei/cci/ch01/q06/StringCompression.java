package nl.rostykerei.cci.ch01.q06;

/**
 * Question 1.6 - String Compression.
 *
 * @author Rosty Kerei
 */
public interface StringCompression {

    /**
     * Compresses given string using the counts of repeated characters.
     *
     * @param input string to compress
     * @return compressed string or original input if compressed is larger than original
     */
    String compress(String input);
}
