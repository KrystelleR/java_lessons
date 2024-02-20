import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateValidator{
	public static boolean isValid(String datestr){
		try{
			SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);
			Date date = formatter.parse(datestr);		
			return true;
		}
		catch(Exception e){
			Prompter prompter = new Prompter();
			System.out.println("Invalid. Try again.");
			return false;
		}

	}
}