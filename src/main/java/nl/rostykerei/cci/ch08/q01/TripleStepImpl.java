package nl.rostykerei.cci.ch08.q01;

/**
 * Brute-force recursive implementataion of {@link TripleStep}.
 *
 * @author Rosty Kerei
 */
public final class TripleStepImpl implements TripleStep {

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
