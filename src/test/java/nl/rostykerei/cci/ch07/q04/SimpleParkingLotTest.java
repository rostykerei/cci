package nl.rostykerei.cci.ch07.q04;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleParkingLotTest {

    @Test
    public void testParking() {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Bus bus = new Bus();

        Truck truck = new Truck();

        ParkingLot parking = new SimpleParkingLot(10);

        assertTrue(parking.parkVehicle(car1));
        assertTrue(parking.parkVehicle(car2));
        assertTrue(parking.parkVehicle(bus));
        assertTrue(parking.parkVehicle(truck));

        assertFalse(parking.parkVehicle(car3));

        assertTrue(parking.unparkVehicle(car1));

        assertTrue(parking.parkVehicle(car3));

        assertFalse(parking.unparkVehicle(car1));
    }
}