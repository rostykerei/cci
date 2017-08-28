package nl.rostykerei.cci.ch01.q05;

/**
 * Implementation of {@link OneWay}.
 *
 * @author Rosty Kerei
 */
public final class OneWayImpl implements OneWay {

    @Override
    public boolean isOneAway(final String str1, final String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        char[] bigger;
        char[] smaller;

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
