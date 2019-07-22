import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager managerA;

    @Before
    public void setup(){
       managerA = new Manager("Luke Wilson", "TT0000000", 30000, "IT Support");
    }


    @Test
    public void canHaveAName() {
        assertEquals("Luke Wilson", managerA.getName());
    }

    @Test
    public void canHaveAnNINumber() {
        assertEquals("TT0000000", managerA.getNINumber());
    }

    @Test
    public void canHaveASalery() {
        assertEquals(30000, managerA.getSalery(), 0.1);
    }

    @Test
    public void canHaveADept() {
        assertEquals("IT Support", managerA.getDeptName());
    }

    @Test
    public void canHaveReturnBonusValue() {
        assertEquals(300, managerA.bonus(), 0.1);
    }

    @Test
    public void canHaveAPayRaise() {
        managerA.increaseSalery(5.0);
        assertEquals(30005, managerA.getSalery(), 0.1);
    }
}
