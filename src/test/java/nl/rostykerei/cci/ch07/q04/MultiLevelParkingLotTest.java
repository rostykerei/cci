package nl.rostykerei.cci.ch07.q04;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiLevelParkingLotTest {

    @Test
    public void testMultiLevelParking() {
        ParkingLot parking = new MultiLevelParkingLot(3, 2, 5);

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        Bus bus = new Bus();
        Truck truck = new Truck();

        assertTrue(parking.parkVehicle(car1));
        assertTrue(parking.parkVehicle(car2));
        assertTrue(parking.parkVehicle(car3));

        assertTrue(parking.parkVehicle(bus));

        assertFalse(parking.parkVehicle(truck));

        assertTrue(parking.parkVehicle(car4));
        assertTrue(parking.parkVehicle(car5));

        assertTrue(parking.unparkVehicle(bus));
        assertTrue(parking.unparkVehicle(car4));
        assertTrue(parking.unparkVehicle(car5));

        assertTrue(parking.parkVehicle(truck));

        assertTrue(parking.parkVehicle(car4));
        assertTrue(parking.parkVehicle(car5));

        assertFalse(parking.parkVehicle(bus));
        assertFalse(parking.unparkVehicle(bus));
    }
}