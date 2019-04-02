import ThemePark.Stalls.Tobaccostall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccostallTest {

    Tobaccostall tobaccostall;

    @Before
    public void before() {
        tobaccostall = new Tobaccostall("Tasty_Goof", 5, "Emil", "NorthPark");
    }

    @Test
    public void canGetRating() {
        tobaccostall.setRating(7);
        assertEquals(7, tobaccostall.getRating());
    }

    @Test
    public void hasName() {
        tobaccostall.setName("Robbers & Pipes");
        assertEquals("Robbers & Pipes", tobaccostall.getName());
    }

    @Test
    public void canGetOwnerName() {
        tobaccostall.setOwnerName("Juli");
        assertEquals("Juli", tobaccostall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        tobaccostall.setParkingSpot("SouthPark");
        assertEquals("SouthPark", tobaccostall.getParkingSpot());
    }

}