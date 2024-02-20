public class Challenge1Main{
	public static void main (String[] args){
		//Calling prompter class
		Prompter prompter = new Prompter();
		
		//Getting user's name and surname
		String nameStr = prompter.prompt("What is your name:") + " " + prompter.prompt("What is your surname:");

		//Getting users dob and calculating age
		DateValidator dv = new DateValidator();
		String dob = "";
		while(true){
		 	dob = prompter.prompt("Enter your date of birth(DD/MM/YYYY):");
			if(dv.isValid(dob)){
				break;
			}
		}
		AgeCalculator ac = new AgeCalculator();
		String age = String.valueOf(ac.calculate(dob));
		
		//Getting distance in km, calidating number and converting it in miles
		NumberValidator nv = new NumberValidator();
		String distance = "";
		while(true){
			distance = prompter.prompt("How far is your favourite store from your home? (in km):");
			if(nv.isValid(distance)){
				break;
			}
		}
		MilesCalculator mc = new MilesCalculator();
		String distanceMiles = String.valueOf(mc.calculate(distance));

		//Prints out information back to user
		Printer print = new Printer();
		print.print(nameStr, age, distanceMiles);
	}
}