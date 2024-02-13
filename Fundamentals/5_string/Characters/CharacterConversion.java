import java.util.Scanner;
public class CharacterConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first letter of your surname");
		String surnameStr = scan.next();
		char surname = surnameStr.charAt(0);
		System.out.println("Your surname starts with a " + surname);
	}
}