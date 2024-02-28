import java.util.Scanner;

class Prompter{
	/*
			Prompter method that will ask user a question and get an input value.
	*/
		public static String prompt(String message){
			System.out.println(message);
			Scanner scan = new Scanner(System.in);
			return scan.nextLine();
	}
}