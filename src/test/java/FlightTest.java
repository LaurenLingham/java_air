import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Passenger;
import people.Pilot;
import people.Rank;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrew crewMember1;
    CabinCrew crewMember2;
    Passenger passenger;

    @Before
    public void before() {
        plane = new Plane(PlaneModel.BOEING_747);
        pilot = new Pilot("Chester", Rank.FIRST_OFFICER, "AB123");
        crewMember1 = new CabinCrew("Shirley", Rank.FLIGHT_ATTENDANT);
        crewMember2 = new CabinCrew("Rita", Rank.CAPTAIN);
        passenger = new Passenger("Carl", 1);
        flight = new Flight(plane, "FLY1", "EDI", "GLA", "10:00");
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FLY1", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("EDI", flight.getDestinationAirport());
    }

    @Test
    public void hasDepartingAirport() {
        assertEquals("GLA", flight.getDepartingAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("10:00", flight.getDepartureTime());
    }

    @Test
    public void canAddPilot() {
        flight.setPilot(pilot);
        assertEquals("Chester", flight.getPilot().getName());
    }

    @Test
    public void startsWithNoPassengers() {
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void startsWithNoCrewMembers() {
        assertEquals(0, flight.getNumberOfCrew());
    }

    @Test
    public void canAddCrewMembers() {
        flight.addCabinCrewMember(crewMember1);
        assertEquals(1, flight.getNumberOfCrew());
    }
}