package nl.rostykerei.cci.ch07.q04;

/**
 * Bus implementation of {@link Vehicle}.
 *
 * @author Rosty Kerei
 */
public class Bus implements Vehicle {

    /**
     * Vehicle size.
     */
    private static final int SIZE = 3;

    /**
     * {@inheritDoc}
     */
    @Override
    public int getSize() {
        return SIZE;
    }
}
