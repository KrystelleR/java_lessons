import java.util.Scanner;
class Prompter{
	  // Method to prompt user for input
	public static String prompt(String message){
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}