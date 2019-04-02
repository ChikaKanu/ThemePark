import ThemePark.Stalls.Icecreamstall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IcecreamstallTest {

    Icecreamstall icecreamstall;

    @Before
    public void before() {
        icecreamstall = new Icecreamstall("TwinPlus", 7, "Amos", "EastPark");
    }

    @Test
    public void canGetRating() {
        icecreamstall.setRating(9);
        assertEquals(9, icecreamstall.getRating());
    }

    @Test
    public void hasName() {
        icecreamstall.setName("TwinALL_ice");
        assertEquals("TwinALL_ice", icecreamstall.getName());
    }

    @Test
    public void canGetOwnerName() {
        icecreamstall.setOwnerName("Chuck");
        assertEquals("Chuck", icecreamstall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        icecreamstall.setParkingSpot("WestEnd");
        assertEquals("WestEnd", icecreamstall.getParkingSpot());
    }

}
