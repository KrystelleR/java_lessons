import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class UserDAO{
	public static String[][] Database = new String[0][6];

	//method to create a new user
	public static void create(String nameIn, String surnameIn, String email, String dob, String id){
		IncreaseDatabaseRows();
		//get age
		String age = String.format("%.2f", (AgeCalculator.calculate(dob)));
		String name = String.valueOf(nameIn.charAt(0)).toUpperCase() + nameIn.substring(1, nameIn.length());
		String surname = String.valueOf(surnameIn.charAt(0)).toUpperCase() + surnameIn.substring(1, surnameIn.length());
		//add to db
		String userID = String.valueOf(Database.length);
		Database[Database.length-1][0] = userID;
		Database[Database.length-1][1] = name;
		Database[Database.length-1][2] = surname;
		Database[Database.length-1][3] = email;
		Database[Database.length-1][4] = dob;
		Database[Database.length-1][5] = id;
	}

	// //method to update a user
	public static void update(String originalEmail, String nameIn, String surnameIn, String emailIn, String dobIn, String idIn){
		String name ="";
		String surname = "";
		for(int i =0; i <Database.length; i++){
			if((Database[i][3]).equals(originalEmail)){
				name = Database[i][1];
				if(nameIn.equals("")==false){
					Database[i][1] = nameIn;
					name = nameIn;
				}
				surname = Database[i][2];
				if(surnameIn.equals("")==false){
					Database[i][2] = surnameIn;
					surname = surnameIn;
				}
				if(emailIn.equals("")==false){
					Database[i][3] = emailIn;
				}
				if(dobIn.equals("")==false){
					Database[i][4] = dobIn;
				}
				if(idIn.equals("")==false){
					Database[i][5] = idIn;
				}				
				break;
			}
		}
		//confirm with user
		System.out.println("\n" + name + " " + surname + " has successfully been updated in the database.\n");
	}

	//method to update a user
	public static void update(String originalEmail, String valueToChange, int index){
		for(int i =0; i <Database.length; i++){
			if((Database[i][3]).equals(originalEmail)){
				Database[i][index] = valueToChange;
				break;
			}
		}
	}

	//method to get a user by email
	public static String[] getUserByEmail(String email){
		for(int i =0; i <Database.length; i++){
			if(Database[i][3].equals(email)){
				return Database[i];
			}
		}
		return null;
	}

	//method to find all users
	public static String[] findAll(){
		String[] names = new String[Database.length];
		for(int i = 0; i< Database.length; i++){
			names[i] = "Name:  "+ Database[i][1] + ", Surname: "+ Database[i][2]+ ", Email: " + Database[i][3] + "\n";
		}
		return names;
	}

	//method to see if user already exists
	public static boolean userExists(String email){
		for(int i =0; i <Database.length; i++){
			if(Database[i][3].equals(email)){
				return true;
			}
		}
		return false;
	}

	//get by id

	public static void IncreaseDatabaseRows(){
		String[][] increasedArray = new String[Database.length+1][6];
		for(int i = 0; i <Database.length; i++){
			for(int j =0; j <Database[i].length; j++){
				increasedArray[i][j] = Database[i][j];
			}
		}
		Database = increasedArray;
	}

	public static void delete(String email){
		String[][] decreasedArray = new String [Database.length-1][6];
		int row=0;
		for(int i =0; i <Database.length; i++){
			if(Database[i][3].equals(email) == false){
				decreasedArray[row++] = Database[i];
			}
		}	
		Database = decreasedArray;
		System.out.println("User was successfully deleted from the database.");
	}










	//read database file
	public static void readUsersInFile(){
		try{
			File file = new File("Challenge3_Db.txt");
			String userID = "";
			String name = "";
			String surname = "";
			String email = "";
			String dob = "";
			String id = "";
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()){
				userID=reader.nextLine();
				name = reader.nextLine();
				surname = reader.nextLine();
				email = reader.nextLine();
				dob = reader.nextLine();
				id = reader.nextLine();
				create(name, surname, email, dob, id);
			}
		}
		//catch for if error occurs
		catch(Exception e){
			System.out.println("Exception occured:");
			e.printStackTrace();
		}
	}


	//write to database file
	public static void createNewUserInFile(){
		int lastElement = Database.length-1;
		  try (FileWriter file = new FileWriter("Challenge3_Db.txt", true)) {
			for(int i =0 ; i < Database[lastElement].length; i++){
				file.write(Database[lastElement][i] + "\n");
			}
			file.close();
		}
		//catch for if error occurs
		catch(Exception e){
			System.out.println("Exception occured:");
			e.printStackTrace();
		}
	}

	//overwrite file with new information (For delete and update)
	public static void overwriteOriginalFile(){
		try{
			FileWriter file = new FileWriter("Challenge3_Db.txt");
			for(int i =0; i <Database.length; i++){
				for(int j=0; j<Database[i].length; j++){
					file.write(Database[i][j]+"\n");
				}
			}
			file.close();
		}
		//catch for if error occurs
		catch(Exception e){
			System.out.println("Exception occured:");
			e.printStackTrace();
		}
	}
}