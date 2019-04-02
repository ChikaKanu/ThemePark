import ThemePark.Stalls.Tobaccostall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccostallTest {

    Tobaccostall tobaccostall;
    Visitor visitor;

    @Before
    public void before() {
        tobaccostall = new Tobaccostall("Tasty_Goof", 5, "Emil", "NorthPark");
        visitor = new Visitor(18, 175, 80);
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

    @Test
    public void canAdmitVisitors18YrsAndAbove() {
        tobaccostall.isAllowedTo(visitor);
        assertEquals(1, tobaccostall.visitorsCount());
    }

    @Test
    public void cannotAdmitVisitorsUnder18Yrs() {
        visitor = new Visitor(12, 165, 80);
        assertEquals(false,  tobaccostall.isAllowedTo(visitor));
        assertEquals(0, tobaccostall.visitorsCount());
    }

}