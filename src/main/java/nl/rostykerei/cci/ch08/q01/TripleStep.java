package nl.rostykerei.cci.ch08.q01;

/**
 * Question 8.1 - Triple Step.
 *
 * @author Rosty Kerei
 */
public interface TripleStep {

    /**
     * Possible hops at a time.
     */
    int[] HOPS = {1, 2, 3};

    /**
     * Counts how many possible ways the child can run up the stairs.
     *
     * @param stairs number of stairs
     * @return a number of possible way doing 1, 2 or 3 steps at a time
     */
    int countPossibleWays(int stairs);

}
