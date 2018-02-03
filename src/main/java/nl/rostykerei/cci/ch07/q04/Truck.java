package nl.rostykerei.cci.ch07.q04;

/**
 * Truck implementaion of {@link Vehicle}.
 *
 * @author Rosty Kerei
 */
public class Truck implements Vehicle {

    /**
     * Vehicle size.
     */
    private static final int SIZE = 5;

    /**
     * {@inheritDoc}
     */
    @Override
    public int getSize() {
        return SIZE;
    }
}
