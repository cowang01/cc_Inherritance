import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest  {

    Developer developerA;

    @Before
    public void setUp() {
        developerA = new Developer("James Dean", "TT0000000", 45000);
    }


    @Test
    public void canHaveANAme() {
        assertEquals("James Dean", developerA.getName());
    }

    @Test
    public void canHaveAPayRaise() {
        developerA.increaseSalery(5000);
        assertEquals(50000, developerA.getSalery(), 0.1);
    }

    @Test
    public void canGetBonus() {
        double bonus = developerA.bonus();
        assertEquals(450, bonus, 0.1);
    }
}
