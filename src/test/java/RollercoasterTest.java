import ThemePark.Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

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

    @Test
    public void canAdmitVisitorsOver12YrsAnd145cmHeight() {
        visitor = new Visitor(13, 165, 80);
        rollercoaster.isAllowedTo(visitor);
        assertEquals(1, rollercoaster.visitorsCount());
    }

    @Test
    public void cannotAdmitVisitorsUnder12YrsBelow() {
        visitor = new Visitor(11, 150, 90);
        assertEquals(false,  rollercoaster.isAllowedTo(visitor));
        assertEquals(0, rollercoaster.visitorsCount());
    }

    @Test
    public void cannotAdmitVisitors145cmBelow() {
        visitor = new Visitor(13, 130, 90);
        assertEquals(false,  rollercoaster.isAllowedTo(visitor));
        assertEquals(0, rollercoaster.visitorsCount());
    }


}
