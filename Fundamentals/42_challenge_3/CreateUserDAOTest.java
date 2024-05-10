import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CreateUserDAOTest{

	//testing if database incremented when new user was added
	@Test
	public void testCreate(){
		String name = "Krystelle";
		String surname = "Rupnarain";
		String email = "Krystelle@test.com";
		String dob = "14/10/2002";
		String id = "1234567890123";

		UserDAO.create(name, surname, email, dob, id);
		assertEquals("Get user array length", 1, UserDAO.Database.length);
		assertEquals("Get user user id", "1", UserDAO.Database[0][0]);
		assertEquals("Get user name", name, UserDAO.Database[0][1]);
		assertEquals("Get user surname", surname, UserDAO.Database[0][2]);
		assertEquals("Get user email", email, UserDAO.Database[0][3]);
		assertEquals("Get user dob", dob, UserDAO.Database[0][4]);
		assertEquals("Get user id", id, UserDAO.Database[0][5]);
	}

	//testing if email davildator gives correct response
	@Test
	public void testValidateEmail(){
		String validEmail1 = "Krystelle@test.com";
		String validEmail2 = "Krystelle@test.com";
		String invalidEmail1 = "abc";
		String invalidEmail2 = "abc@";

		assertEquals("is valid email", true, EmailValidator.isValid(validEmail1));
		assertEquals("is valid email", true, EmailValidator.isValid(validEmail2));
		assertEquals("is invalid email", false, EmailValidator.isValid(invalidEmail1));
		assertEquals("is invalid email", false, EmailValidator.isValid(invalidEmail2));
	}

	//testing if date validator gives correct repsonse
	@Test
	public void testValidateDate(){
		String validDate1 = "14/10/2002";
		String validDate2 = "29/02/2024";
		String invalidDate1 = "29/02/2023";
		String invalidDate2 = "12-11-10";
		String invalidDate3 = "13/11/10";
		String invalidDate4 = "abc";

		assertEquals("is valid date", true, DateValidator.isValid(validDate1));
		assertEquals("is valid date", true, DateValidator.isValid(validDate2));
		assertEquals("is invalid date", false, DateValidator.isValid(invalidDate1));
		assertEquals("is invalid date", false, DateValidator.isValid(invalidDate2));
		assertEquals("is invalid date", false, DateValidator.isValid(invalidDate3));
		assertEquals("is invalid date", false, DateValidator.isValid(invalidDate4));
	}

	//testing if ID validator gives correct repsonse
	@Test
	public void testValidateID(){
		String validID1 = "0123456789123";
		String validID2 = "1234567890123";
		String invalidID1 = "123";
		String invalidID2 = "112a45678s0123";
		String invalidID3 = "abc";

		assertEquals("is valid ID", true, IDValidator.isValid(validID1));
		assertEquals("is valid ID", true, IDValidator.isValid(validID2));
		assertEquals("is invalid ID", false, IDValidator.isValid(invalidID1));
		assertEquals("is invalid ID", false, IDValidator.isValid(invalidID2));
		assertEquals("is invalid ID", false, IDValidator.isValid(invalidID3));
	}

	//testing if age calculator calculates age correctly
	@Test
	public void testAgeCalculator(){
		String date1 = "14/10/2002";
		String date2 = "01/04/2000";

		assertEquals("correct age", 21.5, AgeCalculator.calculate(date1), 0.1);
		assertEquals("correct age", 24.0, AgeCalculator.calculate(date2), 0.1);
	}

	//testing if string was valid number
	@Test
	public void testValidNumber(){
		String validNumber1 = "1234567";
		String validNumber2 = "012345";
		String invalidNumber1 = "abc";

		assertEquals("is valid number", true, NumberValidator.isValid(validNumber1));
		assertEquals("is valid number", true, NumberValidator.isValid(validNumber2));
		assertEquals("is invalid number", false, NumberValidator.isValid(invalidNumber1));
	}

	//testing if user already exists in database
	@Test
	public void testUserExists(){
		String email= "tester@test.com";
		assertEquals("user found", false, UserDAO.userExists(email));
		UserDAO.create("name", "surname", "tester@test.com", "01/01/2000", "123467890123");
		assertEquals("user found", true, UserDAO.userExists(email));
	}
}