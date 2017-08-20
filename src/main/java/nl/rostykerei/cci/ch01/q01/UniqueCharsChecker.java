package nl.rostykerei.cci.ch01.q01;

/**
 * Question 1.1 - Is Unique.
 *
 * @author Rosty Kerei
 */
public interface UniqueCharsChecker {

    /**
     * Checks if the input string has all unique characters.
     *
     * @param input string to check
     * @return <code>true</code> if the input has all unique characters, false otherwise
     */
    boolean isUniqueCharsOnly(String input);

}
