package nl.rostykerei.cci.ch07.q04;

import java.util.HashSet;
import java.util.Set;

/**
 * Simple implementaion of {@link ParkingLot}.
 *
 * @author Rosty Kerei
 */
public class SimpleParkingLot implements ParkingLot {

    /**
     * Parking lot capacity.
     */
    private int capacity;

    /**
     * Number of occupied spots.
     */
    private int occupied = 0;

    /**
     * Set of parked vehicles.
     */
    private Set<Vehicle> parkedVehicles = new HashSet<>();

    /**
     * Constructor.
     *
     * @param lotCapacity lot capacity
     */
    public SimpleParkingLot(final int lotCapacity) {
        this.capacity = lotCapacity;
    }

    @Override
    public final boolean parkVehicle(final Vehicle vehicle) {
        if (vehicle.getSize() + occupied <= capacity) {
            occupied += vehicle.getSize();
            parkedVehicles.add(vehicle);

            return true;
        }

        return false;
    }

    @Override
    public final boolean unparkVehicle(final Vehicle vehicle) {
        if (parkedVehicles.contains(vehicle)) {
            parkedVehicles.remove(vehicle);
            occupied -= vehicle.getSize();

            return true;
        }

        return false;
    }
}
