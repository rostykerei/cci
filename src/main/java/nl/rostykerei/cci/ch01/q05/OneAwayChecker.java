package nl.rostykerei.cci.ch01.q05;

/**
 * Question 1.5 - One Away.
 *
 * @author Rosty Kerei
 */
public class OneAwayChecker {

    /**
     * Checks if given two strings are one edit (insert/delete/modify) away.
     *
     * @param str1 fists string
     * @param str2 second string
     * @return true if strings are one edit away, false otherwise
     */
    public static boolean isOneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        char[] bigger, smaller;

        if (str1.length() > str2.length()) {
            bigger = str1.toCharArray();
            smaller = str2.toCharArray();
        } else {
            bigger = str2.toCharArray();
            smaller = str1.toCharArray();
        }

        int iSmaller = 0;
        boolean diffFound = false;

        for (char aBigger : bigger) {
            if (iSmaller >= smaller.length || aBigger != smaller[iSmaller]) {
                if (diffFound) {
                    return false;
                }

                diffFound = true;

                if (bigger.length == smaller.length) {
                    iSmaller++;
                }
            } else {
                iSmaller++;
            }
        }

        return diffFound;
    }

}
