import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(21, 180, 100);
    }

    @Test
    public void canGetAge() {
        visitor.setAge(32);
        assertEquals(32, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        visitor.setHeight(176);
        assertEquals(176, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        visitor.setMoney(150);
        assertEquals(150, visitor.getMoney(), 0);
    }

}
