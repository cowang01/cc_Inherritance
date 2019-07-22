import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;


    @Before
    public void setUp()  {
        director = new Director("Sam Smith", "TT000000", 80000, 100000);
    }


    @Test
    public void canHaveAName() {
        assertEquals("Sam Smith", director.getName());
    }

    @Test
    public void canHaveBonus() {
        assertEquals(800, director.bonus(), 0.1);
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000, director.getBudget(), 0.1);
    }

    @Test
    public void canRecievePayIncrease() {
        director.increaseSalery(20000);
        assertEquals(100000, director.getSalery(), 0.1);
    }
}
