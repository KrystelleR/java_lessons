import java.util.Scanner;
class Prompter{
	public static String prompt(String message){
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}