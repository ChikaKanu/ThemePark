import ThemePark.Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Bull", 8);
    }

    @Test
    public void canGetRating() {
       rollercoaster.setRating(6);
        assertEquals(6, rollercoaster.getRating());
    }

    @Test
    public void hasName() {
        rollercoaster.setName("Emma");
        assertEquals("Emma", rollercoaster.getName());
    }
}
