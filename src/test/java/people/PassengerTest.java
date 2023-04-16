package people;

import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Carl", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Carl", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(1, passenger.getBags());
    }

    @Test
    public void canChangeName() {
        passenger.setName("Dave");
        assertEquals("Dave", passenger.getName());
    }

    @Test
    public void canChangeNumberOfBags() {
        passenger.setBags(2);
        assertEquals(2, passenger.getBags());
    }
}
