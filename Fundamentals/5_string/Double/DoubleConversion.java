import java.util.Scanner;
public class DoubleConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your current income (to the 2nd decimal place)");
		String incomeStr = scan.next();
		double income = Double.parseDouble(incomeStr);
		System.out.println("Your current income is: " + income);
	}
}