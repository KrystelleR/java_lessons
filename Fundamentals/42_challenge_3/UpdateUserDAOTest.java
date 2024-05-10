import org.junit.*;
import static org.junit.Assert.*;

public class UpdateUserDAOTest{

	//testing if database changed value to updated users value
	@Test
	public void testUpdate(){
		//testing if name changed only
		UserDAO.create("Krystelle", "Rupnarain", "Krystelle@test.com", "14/10/2002", "1234567890123");
		UserDAO.update("Krystelle@test.com", "Xavier", "Naidoo", "Xavier@test.com", "24/08/2002", "0987654321321");
		assertEquals("User name updated", "Xavier", UserDAO.Database[0][1]);

		//testing when email address and other value changed
		UserDAO.create("Ghislain", "Ilunga", "Ghislain@test.com", "01/04/2000", "0987654321321");
		UserDAO.update("Ghislain@test.com", "Ghislain", "Rupnarain", "GCI@test.com", "01/04/2000", "0987654321321");
		assertEquals("User email updated", "GCI@test.com", UserDAO.Database[1][3]);
		assertEquals("User surname updated", "Rupnarain", UserDAO.Database[1][2]);
	}
}