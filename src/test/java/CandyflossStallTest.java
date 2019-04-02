import ThemePark.Stalls.Candyflossstall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyflossStallTest {

    Candyflossstall candyflossstall;

    @Before
    public void before() {
        candyflossstall = new Candyflossstall("ChopChop", 6, "Joseph", "Westpack");
    }

    @Test
    public void canGetRating() {
        candyflossstall.setRating(8);
        assertEquals(8, candyflossstall.getRating());
    }

    @Test
    public void hasName() {
        candyflossstall.setName("Choppers");
        assertEquals("Choppers", candyflossstall.getName());
    }

    @Test
    public void canGetOwnerName() {
        candyflossstall.setOwnerName("Clem");
        assertEquals("Clem", candyflossstall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        candyflossstall.setParkingSpot("EastEnd");
        assertEquals("EastEnd", candyflossstall.getParkingSpot());
    }

}