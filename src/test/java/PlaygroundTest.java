import ThemePark.Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {

        playground = new Playground("Hock", 5);
        visitor = new Visitor(12, 140, 50);
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

    @Test
    public void canAdmitVisitorsNotMoreThan15Yrs() {
        playground.isAllowedTo(visitor);
        assertEquals(1, playground.visitorsCount());
    }

    @Test
    public void cannotAdmitVisitorsMoreThan15Yrs() {
        assertEquals(false,  playground.isAllowedTo(visitor));
    }

}
