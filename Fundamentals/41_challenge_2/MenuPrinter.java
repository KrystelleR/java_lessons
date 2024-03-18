class MenuPrinter{
	// Method to print welcome message
public static String printWelcome(){	
		return "\n****************************************" + "\n"+ "Welcome to the Menu Driven Calculator!" + "\n" + 
			"****************************************" + "\n\n";
	}
	// Method to print menu options
	public static String printMenu(){	
		return   "Enter the appropriate operator sign or menu number. \n1. (+) Addition\n2. (-) Subtraction\n3. (*) Multiplication\n4. (/) Division\n5. (%) Modulus\n6. View all history"+
			"\n\nOr enter 'X' to exit.";
	}

   // Method to print message for repeating calculation
	public static String printRepeat(String result){
		return "Would you like to continue with the value of " + result +  "?\nEnter 'y' for yes or any other value to return to the main menu.";
	}

}