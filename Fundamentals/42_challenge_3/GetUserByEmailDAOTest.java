import org.junit.*;
import static org.junit.Assert.*;

public class GetUserByEmailDAOTest{

	//testing if database decremented when new user was added
	@Test
	public void testGetUserByEmail(){
		UserDAO.create("Krystelle", "Rupnarain", "Krystelle@test.com", "14/10/2002", "1234567890123");
		String[] test = UserDAO.getUserByEmail("Krystelle@test.com");
		assertEquals("Get user array length", test.length, 6);
		assertEquals("Get user user id", test[0], UserDAO.Database[0][0]);
		assertEquals("Get user name", test[1], UserDAO.Database[0][1]);
		assertEquals("Get user surname", test[2], UserDAO.Database[0][2]);
		assertEquals("Get user email", test[3], UserDAO.Database[0][3]);
		assertEquals("Get user dob", test[4], UserDAO.Database[0][4]);
		assertEquals("Get user id", test[5], UserDAO.Database[0][5]);
	}
}