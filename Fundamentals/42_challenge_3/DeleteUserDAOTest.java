import org.junit.*;
import static org.junit.Assert.*;

public class DeleteUserDAOTest{

	//testing if database decremented when new user was added
	@Test
	public void testDelete(){
		String email = "Krystelle@test.com";
		UserDAO.create("Krystelle", "Rupnarain", "Krystelle@test.com", "14/10/2002", "1234567890123");
		assertEquals("Is user found?" true, UserDAO.userExists(email));
		UserDAO.delete(email);
		assertEquals("Delete a user", 0, UserDAO.Database.length);
		assertEquals("Is user found?" false, UserDAO.userExists(email)); 

	}
}