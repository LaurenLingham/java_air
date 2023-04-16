package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Shirley", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Shirley", cabinCrew.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }

    @Test
    public void canMakeAnnouncement() {
        assertEquals("Welcome aboard", cabinCrew.relayMessage("Welcome aboard"));
    }
}
