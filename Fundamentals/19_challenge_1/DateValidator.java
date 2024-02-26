import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class DateValidator{
	public static boolean isValid(String datestr){
	//try and catch- if the parsing of the string as a double fails, then it is an invalid number
		try{
			//converting string to LocalDate using DateTimeFormatter
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dob = LocalDate.parse(datestr, formatter);
			return true;
		}
		//if the try fails, then this will run
		catch(Exception e){
			//re-prompting user to enter a new date
			System.out.println("Invalid. Try again.");
			return false;
		}

	}
}