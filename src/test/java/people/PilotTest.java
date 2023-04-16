package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Chester", Rank.FIRST_OFFICER, "AB123");
    }

    @Test
    public void hasName() {
        assertEquals("Chester", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FIRST_OFFICER, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("AB123", pilot.getLicenceNumber());
    }
}
