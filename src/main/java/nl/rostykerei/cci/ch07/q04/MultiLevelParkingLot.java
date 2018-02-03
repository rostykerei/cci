package nl.rostykerei.cci.ch07.q04;

import java.util.ArrayList;
import java.util.List;

/**
 * Multi-level parking implementation of {@link ParkingLot}.
 *
 * @author Rosty Kerei
 */
public class MultiLevelParkingLot implements ParkingLot {

    /**
     * List of parking levels.
     */
    private List<ParkingLot> levels = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param levelsCapacity list of levels capacity
     */
    public MultiLevelParkingLot(final int... levelsCapacity) {

        for (int levelCapacity : levelsCapacity) {
            levels.add(new SimpleParkingLot(levelCapacity));
        }
    }

    @Override
    public final boolean parkVehicle(final Vehicle vehicle) {
        for (ParkingLot level : levels) {
            if (level.parkVehicle(vehicle)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public final boolean unparkVehicle(final Vehicle vehicle) {
        for (ParkingLot level : levels) {
            if (level.unparkVehicle(vehicle)) {
                return true;
            }
        }

        return false;
    }
}
