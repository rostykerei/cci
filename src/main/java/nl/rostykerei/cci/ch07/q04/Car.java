package nl.rostykerei.cci.ch07.q04;

/**
 * Car implementation of {@link Vehicle}.
 *
 * @author Rosty Kerei
 */
public class Car implements Vehicle {

    /**
     * Vehicle size.
     */
    private static final int SIZE = 1;

    /**
     * {@inheritDoc}
     */
    @Override
    public int getSize() {
        return SIZE;
    }

}
