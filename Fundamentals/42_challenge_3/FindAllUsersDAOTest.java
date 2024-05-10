import org.junit.*;
import static org.junit.Assert.*;

public class FindAllUsersDAOTest{

	//testing if database changed value to updated users value
	@Test
	public void testFindAll(){
		UserDAO.create("Krystelle", "Rupnarain", "Krystelle@test.com", "14/10/2002", "1234567890123");
		String user1 = "Name:  "+ "Krystelle" + ", Surname: "+ "Rupnarain"+ ", Email: " + "Krystelle@test.com" + "\n";
		UserDAO.create("Xavier", "Naidoo", "Xavier@test.com", "24/08/2002", "0987654321321");
		String user2 = "Name:  "+ "Xavier" + ", Surname: "+ "Naidoo"+ ", Email: " + "Xavier@test.com" + "\n";
		String[] test = UserDAO.findAll();
		assertEquals("User1 found", user1, test[0]);
		assertEquals("User2 found", user2, test[1]);
	}
}