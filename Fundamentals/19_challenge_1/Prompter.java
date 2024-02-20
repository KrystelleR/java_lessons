import java.util.Scanner;
public class Prompter{
	public static String prompt(String message){
		String input;
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return input = scan.nextLine();
	}
}