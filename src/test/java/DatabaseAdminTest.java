import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Mike Myres", "TT000000", 20000);
    }



    @Test
    public void canHaveNINumber() {
        assertEquals("TT000000", databaseAdmin.getNINumber());
    }

    @Test
    public void canHaveNewSalary() {
        databaseAdmin.increaseSalery(20000);
        assertEquals(40000, databaseAdmin.getSalery(), 0.1);
    }

    @Test
    public void canRetrieveBonus() {
        assertEquals(200, databaseAdmin.bonus(), 0.1);
    }
}
