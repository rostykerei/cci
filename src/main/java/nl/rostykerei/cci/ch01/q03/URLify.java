package nl.rostykerei.cci.ch01.q03;

/**
 * Question 1.3 - URLify.
 *
 * @author Rosty Kerei
 */
public interface URLify {

    /**
     * Replaces all spaces in the input string with '%20'.
     *
     * @param input      input string
     * @param trueLength true length of the input string excluding right spaces
     * @return result string
     */
    char[] replaceSpaces(char[] input, int trueLength);
}
