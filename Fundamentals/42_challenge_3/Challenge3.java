class Challenge3{

	public static String name="";
	public static String surname="";
	public static String dob= "";
	public static String id = "";
	public static String email ="";

	public static void main(String[] args) {
		//during start up, first add all previous users to in database to 2D array
		UserDAO.readUsersInFile();
		while(true){
			int option = MenuPrinter.printMain();
			switch(option){
			case 1:
				//add a new user
				while(true){
					email = Prompter.prompt("Enter user's email: ");
					if(UserDAO.userExists(email)==false){
						if(EmailValidator.isValid(email)){
							break;
						}
						else{
							System.out.println("Invalid email. Email should contain '@' and email domain (.com or .co.za)");
						}
					}
					else{
						System.out.println("Email already exists. Please enter a unique email address.");
					}
				}

				while(true){
					name = Prompter.prompt("Enter user's name: ");
					if(name.length()!=0){
						break;
					}
					else{
						System.out.println("Name cannnot be blank.");
					}
				}

				while(true){
					surname = Prompter.prompt("Enter user's surname: ");
					if(surname.length()!=0){
						break;
					}
					else{
						System.out.println("Surname cannot be blank");
					}
				}

				while(true){
					dob = Prompter.prompt("Enter user's date of birth: ");
					if(DateValidator.isValid(dob)){
						System.out.println("User is " + String.format("%.2f", (AgeCalculator.calculate(dob))) + " years old.");
						break;
					}
					else{
						System.out.println("Invalid date of birth. Please enter user's date of birth in the following format: dd/mm/yyyy");
					}
				}

				while(true){
					id = Prompter.prompt("Enter user's id: ");
					if(IDValidator.isValid(id)){
						break;
					}
					else{
						System.out.println("Invalid ID. ID must be numerical and 13 digits");
					}
				}

				UserDAO.create(name, surname, email, dob, id);
				//confirm with user
				System.out.println("\n" + name + " " + surname + " has successfully been added to the database.\n");
				UserDAO.createNewUserInFile();
				break;

			case 2: 
				//update a user
				String originalEmail;
				while(true){
					originalEmail = Prompter.prompt("Please enter the email address of the user you would like to update.");
					if(UserDAO.userExists(originalEmail)){
						name="";
						surname="";
						email="";
						dob="";
						id="";

						while(true){
						int updateOption = MenuPrinter.printUpdateMenu(originalEmail);
						switch(updateOption){
							case 1:
								name="";
								//checking if should edit name
									while(true){
										name = Prompter.prompt("Enter user's name: ");
										if(name.length()!=0){
											break;
										}
										else{
											System.out.println("Name cannnot be blank.");
										}
									}
								break;
							case 2:
								surname ="";
								//checking if should edit surname
									while(true){
										surname = Prompter.prompt("Enter user's surname: ");
										if(surname.length()!=0){
											break;
										}
										else{
											System.out.println("Surname cannnot be blank.");
										}
									}
								break;
							case 3:
								email="";
								//checking if should edit email address
								while(true){
									email = Prompter.prompt("Enter user's email: ");
									if(UserDAO.userExists(email)==false){
										if(EmailValidator.isValid(email)){
											break;
										}
										else{
											System.out.println("Invalid email. Email should contain '@' and email domain (.com or .co.za)");
											}										}
										else{
											System.out.println("Email already exists. Please enter a unique email address.");
										}
									}
							break;
							case 4:
								dob= "";
								//checking if should edit dob
									while(true){
										dob = Prompter.prompt("Enter user's date of birth: ");
										if(DateValidator.isValid(dob)){
											System.out.println("User is " + String.format("%.2f", (AgeCalculator.calculate(dob))) + " years old.");
											break;
										}
										else{
											System.out.println("Invalid date of birth. Please enter user's date of birth in the following format: dd/mm/yyyy");
										}
									}
								break;
							case 5:
								id="";
									while(true){
										id = Prompter.prompt("Enter user's id: ");
										if(IDValidator.isValid(id)){
											break;
										}
										else{
											System.out.println("Invalid ID. ID must be numerical and 13 digits");
										}
									}
							break;
						}
						String continueUpdate = Prompter.prompt("Would you like to update another field? Enter 'y' for yes or any other value to exit");
						if(continueUpdate.equalsIgnoreCase("y") == false){
							break;
						}
					}

					UserDAO.update(originalEmail, name, surname, email, dob, id);
					UserDAO.overwriteOriginalFile();
					break;
					}
					else{
						System.out.println("Email address not found. Please enter a valid email address");
					}
				}
				break;
			case 3:
				//delete a user
				if(UserDAO.Database.length!=0){
					while(true){
						email = Prompter.prompt("Enter the email address of the user you would like to delete.");
						if(UserDAO.userExists(email)){
							String choice = Prompter.prompt("Are you sure you would like to delete " + email + " ?\nEnter y for yes or any other value to exit.");
							if(choice.equalsIgnoreCase("y")){
								UserDAO.delete(email);
								UserDAO.overwriteOriginalFile();
							}
							break;
						}
						else{
							System.out.println("Email address not found. Please enter a valid email address");
						}
					}
				}
				else{
					System.out.println("Database empty. Create a new user before using this functionality.\n");
				}
				break;
			case 4:
				if(UserDAO.Database.length!=0){
					while(true){
						email = Prompter.prompt("Enter the email address of the user you would like to find.");
						if(UserDAO.userExists(email)){
							String[] db = UserDAO.getUserByEmail(email);
							System.out.println("\n");
							System.out.println("UserID: " + db[0]);
							System.out.println("Name: " + db[1]);
							System.out.println("Surname: " + db[2]);
							System.out.println("Email: " + db[3]);
							System.out.println("Date of Birth: " + db[4]);
							System.out.println("Age: " + String.format("%.2f", (AgeCalculator.calculate(db[4]))) + " years old");
							System.out.println("ID: " + db[5]);
							System.out.println("\n");

							break;
						}
						else{
							System.out.println("Email address not found. Please enter a valid email address");
						}
					}
				}
				else{
					System.out.println("Database empty. Create a new user before using this functionality.\n");
				}
				break;
			case 5:
				//list all users
				if(UserDAO.Database.length!=0){
					String[] names = UserDAO.findAll();
					System.out.println("\n");
					for(int i =0; i <names.length; i++){
						System.out.println((i+1) + ". " + names[i]);
					}		
				}
				else{
					System.out.println("Database empty. Create a new user before using this functionality.\n");
				}
				break;
			default:
				//default (invalid option)
				System.out.println("Invalid option selected.");
				break;
			}
		}
	}
}