package nl.rostykerei.cci.ch01.q06;

/**
 * Question 1.6 - String Compression.
 *
 * @author Rosty Kerei
 */
public class StringCompression {

    /**
     * Compresses given string using the counts of repeated characters.
     *
     * @param input string to compress
     * @return compressed string or original input if compressed is larger than original
     */
    public static String compress(String input) {
        StringBuilder output = new StringBuilder();
        char[] chars = input.toCharArray();

        int count = 1;

        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                output.append(chars[i]);
                output.append(count);
                count = 1;
            } else {
                count++;
            }
        }

        return output.length() > input.length() ? input : output.toString();
    }
}
