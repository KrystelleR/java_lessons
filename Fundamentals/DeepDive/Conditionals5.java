import java.util.Scanner;

public class Conditionals5{

// Write a program that prompts the user for Name and Grade. 
// If the grade is in high school they should go to block A. 
// If they are in primary block B. Depending on the grade they are in you must pick a random unique name for the class teacher. 
// Junior primary and senior primary have two different physical education teachers. 
// Same applies to high school. Come up with names and print the details with a custom greeting to a student that gives you name and grade. 
// Reuse Prompter from challenge 1. If the Grade is out of school range, show an error.  If the name or surname are blank, show an error message.


	public static main void (String [] args){
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter your name: ");
		String name = scan.nextLine();

		System.out.println("Enter your surname: ");
		String grade = scan.nextLine();

		grade.

		if(grade.equalsIgnoreCase("high school")){
			System.out.println("Go to block A");
		}
		else if (grade.equalsIgnoreCase("primary")){
			System.out.println("Go to block B");
		}

	}
}