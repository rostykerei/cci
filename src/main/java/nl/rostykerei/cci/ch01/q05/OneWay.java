package nl.rostykerei.cci.ch01.q05;

/**
 * Question 1.5 - One Away.
 *
 * @author Rosty Kerei
 */
public interface OneWay {

    /**
     * Checks if given two strings are one edit (insert/delete/modify) away.
     *
     * @param str1 fists string
     * @param str2 second string
     * @return true if strings are one edit away, false otherwise
     */
    boolean isOneAway(String str1, String str2);
}
