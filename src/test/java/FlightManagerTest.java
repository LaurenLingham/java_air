import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger;
    Passenger passenger2;

    @Before
    public void before() {
        plane = new Plane(PlaneModel.BOEING_747);
        flight = new Flight(plane, "FLY1", "EDI", "GLA", "10:00");
        passenger = new Passenger("Carl", 1);
        passenger2 = new Passenger("Sue", 3);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canGetPlaneBaggageWeight() {
        assertEquals(91500, flightManager.planeBaggageWeight());
    }

    @Test
    public void canGetBaggageWeightPerPassenger() {
        assertEquals(219, flightManager.baggageWeightPerPassenger());
    }

    @Test
    public void canGetReservedBaggageWeight() {
        assertEquals(438, flightManager.reservedBaggageWeight());
    }

    @Test
    public void canGetRemainingBaggageWeight() {
        assertEquals(91062, flightManager.remainingBaggageWeight());
    }
}
