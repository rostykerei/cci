package nl.rostykerei.cci.ch08.q01;

import java.util.HashMap;
import java.util.Map;

/**
 * Cache extension to {@link TripleStepImpl}.
 *
 * @author Rosty Kerei
 */
public final class TripleStepCacheImpl extends TripleStepImpl {

    /**
     * Cache map.
     */
    private final Map<Integer, Integer> cache = new HashMap<>();

    @Override
    public int countPossibleWays(final int stairs) {
        if (cache.containsKey(stairs)) {
            return cache.get(stairs);
        }

        int result = super.countPossibleWays(stairs);

        cache.put(stairs, result);

        return result;
    }
}
