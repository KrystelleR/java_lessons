class MenuPrinter{

	public static int printMain(){	
		String option;
		while(true){
			option = Prompter.prompt("Welcome to UserDAO Program.\n" + 
				"**************************************\n\n" + 
				"Please select an option below:\n" + 
				"1) Add new User\n" + 
				"2) Update a User\n" + 
				"3) Delete a User\n" + 
				"4) Find a User\n" + 
				"5) List all Users\n\n" + 
				"Or enter 'X' to exit the application.");

			if(MenuValidator.isMainValid(option)){
				break;
			}
			else{
				System.out.println("Please enter a value between 1 and 5 or 'X' to exit\n\n");
			}
		}
		return Integer.parseInt(option);
	}

	public static int printUpdateMenu(String name){
		String option;
		while(true){
			option = Prompter.prompt(
				"Please select what you would like to update for "  + name + ":\n" + 
				"1) Name\n" + 
				"2) Surname\n" + 
				"3) Email\n" + 
				"4) Date of Birth\n" + 
				"5) ID\n");

			if(MenuValidator.isUpdateValid(option)){
				break;
			}
			else{
				System.out.println("Please enter a value between 1 and 5\n\n");
			}
		}
		return Integer.parseInt(option);
	}

	public static boolean isEditValue(String option){
		if(option.equalsIgnoreCase("y")){
			return true;
		}	
		return false;
	}
}