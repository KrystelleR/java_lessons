import java.util.Scanner;
public class IntegerConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age");
		String ageStr = scan.next();
		int age = Integer.parseInt(ageStr);
		System.out.println("You are " + age+ " years old.");
	}
}