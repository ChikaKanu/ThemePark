import ThemePark.Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before() {
        playground = new Playground("Hock", 5);
    }

    @Test
    public void canGetRating() {
        playground.setRating(6);
        assertEquals(6, playground.getRating());
    }

    @Test
    public void hasName() {
        playground.setName("Horse");
        assertEquals("Horse", playground.getName());
    }
}
