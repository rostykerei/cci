package nl.rostykerei.cci.ch07.q04;

/**
 * Question 7.4 - Parking Lot.
 *
 * @author Rosty Kerei
 */
public interface ParkingLot {

    /**
     * Park a vehicle.
     *
     * @param vehicle vehicle to park
     * @return true if success false otherwise
     */
    boolean parkVehicle(Vehicle vehicle);

    /**
     * Un-park a vehicle.
     *
     * @param vehicle vehicle to unpark
     * @return true if success false otherwise
     */
    boolean unparkVehicle(Vehicle vehicle);

}
