import java.util.Scanner;

public class Prompter3{
	public static String prompt(String message){
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextLine();
	}

}