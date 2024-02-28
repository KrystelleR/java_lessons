import java.util.Scanner;
public class Prompter{
	//scanner method to prompt users (print message and get input from user)
	public static String prompt(String message){
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}