import java.util.Scanner;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class challengepart1{
	public static void main (String [] args){

		Scanner scan = new Scanner (System.in);

		//getting name
		System.out.println("What is your name:");
		String name = scan.nextLine();

		//getting surname
		System.out.println("What is your surname:");
		String surname = scan.nextLine();

		while(true){
			//getting dob
			System.out.println("Enter your date of birth (DD/MM/YYYY):");
			String date_of_birth_str = scan.next();

			//converting String into type date

			try{
			SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY", Locale.ENGLISH); //formatting the data that will then be parsed into the date
			Date date_of_birth = formatter.parse(date_of_birth_str);
			break;
			}
			catch(ParseException e){
				System.out.println(e);
			}
		}

		System.out.println(date_of_birth);

	}
}