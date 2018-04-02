package nl.rostykerei.cci.ch05.q05;

/**
 * Implementation of {@link Debugger}. Assumption that
 * the function checks if the given n is 0 or a power of 2.
 *
 * @author Rosty Kerei
 */
public class DebuggerImpl implements Debugger {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isZeroOrPowerOfTwo(final int n) {
        return (n & (n - 1)) == 0;
    }
}
