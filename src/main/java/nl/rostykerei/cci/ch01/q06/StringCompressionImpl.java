package nl.rostykerei.cci.ch01.q06;

/**
 * Implementation of {@link StringCompression}.
 *
 * @author Rosty Kerei
 */
public final class StringCompressionImpl implements StringCompression {

    @Override
    public String compress(final String input) {
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

        if (output.length() > input.length()) {
            return input;
        } else {
            return output.toString();
        }
    }
}
