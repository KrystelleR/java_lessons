public class Challenge1Main{
	public static void main (String[] args){
		//Getting user's name and surname
		String name = Prompter.prompt("What is your name:");
		String surname = Prompter.prompt("What is your surname:");

		//Getting users dob and calculating age
		//If users dob is invalid, user will be re-prompted until users dob is valid
		String date_of_birth = "";
		while(true){
		 	date_of_birth = Prompter.prompt("Enter your date of birth(DD/MM/YYYY):");
			if(DateValidator.isValid(date_of_birth)){
				break;
			}
		}
		String age = String.valueOf(AgeCalculator.calculate(date_of_birth));
		
		//Getting distance in km, calidating number and converting it in miles
		//If distance is invalid, user will be re-prompted until distance is valid
		String distance_from_store = "";
		while(true){
			distance_from_store = Prompter.prompt("How far is your favourite store from your home? (in km):");
			if(NumberValidator.isValid(distance_from_store)){
				break;
			}
		}
		String distanceMiles = String.valueOf(MilesCalculator.calculate(distance_from_store));

		//Prints out information back to user
		Printer.print((name + " " + surname), age, distanceMiles);
	}
}