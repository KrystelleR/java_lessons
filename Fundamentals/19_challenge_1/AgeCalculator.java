import java.time.LocalDate;

public class AgeCalculator{
public static double calculate(String dobStr){
		//splitting the dob string based on /, splits into 3 parts (date, month and year)
		int day = Integer.parseInt(dobStr.split("/")[0]);
		int month = Integer.parseInt(dobStr.split("/")[1]);
		int year = Integer.parseInt(dobStr.split("/")[2]);
		
		//getting dob as LocalDate
		LocalDate birthDate = LocalDate.of(year, month, day);
		//getting current date as LocalDate
        LocalDate currentDate = LocalDate.now();

		// Subtract current year from years born year for their age
        // Calculate accurate age using years and fraction of a year
        //getDayOfYear() returns the day of the year i.e. 57th day out of 365.25 days within a year
        return currentDate.getYear() - birthDate.getYear() + (currentDate.getDayOfYear() - birthDate.getDayOfYear()) / 365.25;
	}
}
