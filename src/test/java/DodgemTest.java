import ThemePark.Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before() {
        dodgem = new Dodgem("John", 6);
    }

    @Test
    public void canGetRating() {
        dodgem.setRating(8);
        assertEquals(8, dodgem.getRating());
    }

    @Test
    public void hasRating() {
        dodgem.setName("Emma");
        assertEquals("Emma", dodgem.getName());
    }
}
