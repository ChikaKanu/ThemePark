import ThemePark.Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Jokoground", 6);
    }

    @Test
    public void canGetRating() {
        park.setRating(7);
        assertEquals(7, park.getRating());
    }

    @Test
    public void hasName() {
        park.setName("Volta");
        assertEquals("Volta", park.getName());
    }
}
