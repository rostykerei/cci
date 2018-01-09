package nl.rostykerei.cci.ch08.q01;

/**
 * Brute-force recursive implementataion of {@link TripleStep}.
 *
 * @author Rosty Kerei
 */
public class TripleStepImpl implements TripleStep {

    /**
     * Possible hops at a time.
     */
    private static final int[] HOPS = {1, 2, 3};

    /**
     * {@inheritDoc}
     */
    @Override
    public int countPossibleWays(final int stairs) {
        if (stairs < 0) {
            return 0;
        }

        if (stairs == 0) {
            return 1;
        }

        int result = 0;

        for (int hop : HOPS) {
            result += countPossibleWays(stairs - hop);
        }

        return result;
    }
}
